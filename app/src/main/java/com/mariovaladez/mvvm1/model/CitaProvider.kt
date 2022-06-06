package com.mariovaladez.mvvm1.model

class CitaProvider {
    companion object{

        fun random():CitaModel{
            val position= (0..8).random()
           return  cita[position]

        }

    private val cita= listOf<CitaModel>(
        CitaModel("Hola 1, Bienvenido a mi app con ViewModel",
        "Mario Valadez"),
        CitaModel("Hola 2, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 3, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 4, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 5, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 6, Bienvenido a mi app con ViewModel",
            "Anonimo"),
        CitaModel("Hola 7, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 8, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),
        CitaModel("Hola 9, Bienvenido a mi app con ViewModel",
            "Mario Valadez"),


    )
    }


}