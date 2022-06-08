package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.CitasRepository
import com.mariovaladez.mvvm1.data.model.CitasModel
import com.mariovaladez.mvvm1.domain.model.Cita
import javax.inject.Inject

class GetRandomCitaUseCase @Inject constructor(private val repository: CitasRepository) {

    //private val repository = CitasRepository()

    suspend operator fun invoke(): Cita?{
        val citas = repository.getAllCitasFromDataBase()
        if(!citas.isNullOrEmpty()){

            val randomNumber = (citas.indices).random()
            //opcion alternativa para usar el tamaño de la lista
            //val randomNumber = (0..citas.size-1).random()

            return citas[randomNumber]
        }
        return null
    }
}