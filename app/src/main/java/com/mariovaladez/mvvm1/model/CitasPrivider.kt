package com.mariovaladez.mvvm1.model

class CitasPrivider {
    companion object {

        fun ObtenerCita():CitasModel{
            val position = (1..9).random()
            return citas[position]
        }

       private val citas = listOf<CitasModel>(
            CitasModel(
                "Hola 1, Bienvenido a esta app con patron MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 2, Bienvenido a esta app con patron MVVM",
                "Anonimo"
            ),
            CitasModel(
                "Hola 3, Bienvenido a esta app con patron MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 4, Bienvenido a esta app con patron MVVM",
                "Anonimo"
            ),
            CitasModel(
                "Hola 5, Bienvenido a esta app con patron MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 6, Bienvenido a esta app con patron MVVM",
                "Anonimo"
            ),
            CitasModel(
                "Hola 7, Bienvenido a esta app con patron MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 8, Bienvenido a esta app con patron MVVM",
                "Anonimo"
            ),
            CitasModel(
                "Hola 9, Bienvenido a esta app con patron MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 10, Bienvenido a esta app con patron MVVM",
                "Anonimo"
            ),
        )
    }
}