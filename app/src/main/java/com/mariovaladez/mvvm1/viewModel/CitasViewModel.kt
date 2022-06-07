package com.mariovaladez.mvvm1.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariovaladez.mvvm1.model.CitasModel
import com.mariovaladez.mvvm1.model.CitasPrivider

class CitasViewModel : ViewModel(){
    val citasModel= MutableLiveData<CitasModel>()

    fun citaAleatoria(){
        val cita = CitasPrivider.ObtenerCita()
        citasModel.postValue(cita)
    }
}