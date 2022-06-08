package com.mariovaladez.mvvm1.data

import com.mariovaladez.mvvm1.data.database.dao.CitaDao
import com.mariovaladez.mvvm1.data.database.entities.CitaEntity
import com.mariovaladez.mvvm1.domain.model.Cita
import com.mariovaladez.mvvm1.domain.model.toDomain
import com.mariovaladez.mvvm1.network.CitasService
import javax.inject.Inject

class CitasRepository @Inject constructor(
    private val api : CitasService,
    private val citaDao: CitaDao

){



    suspend fun getAllCitasFromApi():List<Cita>{
        val response= api.getCitas()
        return response.map { it.toDomain() }
    }

    suspend fun getAllCitasFromDataBase():List<Cita>{
        val response =citaDao.getAllCitas()
        return response.map { it.toDomain() }
    }

    suspend fun insetCitas(citas:List<CitaEntity>) {
        citaDao.insertAll(citas)

    }

    suspend fun clearCitas() {
        citaDao.deleteAllCitas()
    }
}