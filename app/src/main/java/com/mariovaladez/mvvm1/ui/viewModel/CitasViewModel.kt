package com.mariovaladez.mvvm1.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariovaladez.mvvm1.data.model.CitasModel
import com.mariovaladez.mvvm1.data.model.CitasPrivider
import com.mariovaladez.mvvm1.domain.GetCitasUseCase
import com.mariovaladez.mvvm1.domain.GetRandomCitaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitasViewModel @Inject constructor(
    private val getCitasUseCase:GetCitasUseCase,
    private val getRandomCitaUseCase:GetRandomCitaUseCase

) : ViewModel(){
    val citasModel= MutableLiveData<CitasModel>()

    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {

        viewModelScope.launch {

            isLoading.postValue(true)

            val result=getCitasUseCase()

            if(!result.isNullOrEmpty()){
                citasModel.postValue(result[0])
                isLoading.postValue(false)

            }

        }

    }

    fun citaAleatoria(){
        isLoading.postValue(true)
        val cita = getRandomCitaUseCase()
        if(cita!=null){
            citasModel.postValue(cita)
        }

        isLoading.postValue(false)
    }


}