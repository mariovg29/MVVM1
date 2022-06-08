package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.CitasRepository
import com.mariovaladez.mvvm1.data.model.CitasModel
import javax.inject.Inject


class GetCitasUseCase @Inject constructor(private val repository : CitasRepository) {


    suspend operator fun invoke()=repository.getAllCitas()

}