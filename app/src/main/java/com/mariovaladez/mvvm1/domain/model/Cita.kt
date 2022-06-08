package com.mariovaladez.mvvm1.domain.model

import com.google.gson.annotations.SerializedName
import com.mariovaladez.mvvm1.data.database.entities.CitaEntity
import com.mariovaladez.mvvm1.data.model.CitasModel

data class Cita (


    val cita:String,
    val autor:String,
)
fun CitasModel.toDomain()= Cita(cita, autor)
fun CitaEntity.toDomain()=Cita(cita, autor)