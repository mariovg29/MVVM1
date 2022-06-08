package com.mariovaladez.mvvm1.data

import com.mariovaladez.mvvm1.data.model.CitasModel
import com.mariovaladez.mvvm1.data.model.CitasPrivider
import com.mariovaladez.mvvm1.network.CitasService

class CitasRepository {

    private val api = CitasService()

    suspend fun getAllCitas():List<CitasModel>{
        val response= api.getCitas()
        CitasPrivider.citas = response
        return response
    }
}