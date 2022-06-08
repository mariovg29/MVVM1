package com.mariovaladez.mvvm1.data.model

import com.google.gson.annotations.SerializedName

data class CitasModel (
    //colocar @SerializedName en caso de que el nombre en el back sea distinto al modelo
    @SerializedName("quote") val cita:String,
    @SerializedName("author") val autor:String,
        )
