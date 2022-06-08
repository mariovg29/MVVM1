package com.mariovaladez.mvvm1.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariovaladez.mvvm1.model.QuoteModel
import com.mariovaladez.mvvm1.model.QuoteProvider

class QuoteViewModel:ViewModel(){

    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}