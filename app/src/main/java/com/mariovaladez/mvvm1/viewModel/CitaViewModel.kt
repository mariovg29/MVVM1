package com.mariovaladez.mvvm1.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariovaladez.mvvm1.model.CitaModel
import com.mariovaladez.mvvm1.model.CitaProvider


class CitaViewModel: ViewModel() {

    val citaModel = MutableLiveData<CitaModel>()

    fun randomCita(){
        val currentCita = CitaProvider.random()
        citaModel.postValue(currentCita)

    }
}