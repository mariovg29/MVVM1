package com.mariovaladez.mvvm1.ui.ViewModel

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariovaladez.mvvm1.data.model.QuoteModel
import com.mariovaladez.mvvm1.data.model.QuoteProvider
import com.mariovaladez.mvvm1.databinding.ActivityMainBinding
import com.mariovaladez.mvvm1.domain.GetQuotesUseCase
import com.mariovaladez.mvvm1.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel:ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote() {

        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if(quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}