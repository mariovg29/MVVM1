package com.mariovaladez.mvvm1.data

import com.mariovaladez.mvvm1.data.model.CitasModel
import com.mariovaladez.mvvm1.data.model.CitasPrivider
import com.mariovaladez.mvvm1.network.CitasService
import javax.inject.Inject

class CitasRepository @Inject constructor(
    private val api : CitasService,
    private val citasPrivider: CitasPrivider
){



    suspend fun getAllCitas():List<CitasModel>{
        val response= api.getCitas()
        citasPrivider.citas = response
        return response
    }
}