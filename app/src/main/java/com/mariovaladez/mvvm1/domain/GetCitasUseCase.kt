package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.CitasRepository
import com.mariovaladez.mvvm1.data.database.entities.toDatabase
import com.mariovaladez.mvvm1.data.model.CitasModel
import com.mariovaladez.mvvm1.domain.model.Cita
import javax.inject.Inject


class GetCitasUseCase @Inject constructor(private val repository : CitasRepository) {


    suspend operator fun invoke():List<Cita>{
        val citas = repository.getAllCitasFromApi()

        return if(citas.isNotEmpty()){
            repository.clearCitas()
            repository.insetCitas(citas.map { it.toDatabase() })
            citas
        }else{
            repository.getAllCitasFromDataBase()
        }
    }

}