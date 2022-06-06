package com.mariovaladez.mvvm1.viewModel.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariovaladez.mvvm1.model.CitasModel
import com.mariovaladez.mvvm1.model.CitasProvider

class CitasViewModel:ViewModel(){

    val citasModel= MutableLiveData<CitasModel>()

    fun obtenerCita(){
        val cita= CitasProvider.citaAleatoria()
        return citasModel.postValue(cita)
    }

}