package com.mariovaladez.mvvm1.model

class CitasProvider {
    companion object {

        fun citaAleatoria():CitasModel{
            val position = (0..9).random()
            return citas[position]

        }

        private val citas = listOf<CitasModel>(
            CitasModel(
                "Hola 1, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 2, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 3, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 4, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 5, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 6, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 7, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 8, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 9, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
            CitasModel(
                "Hola 10, Bienvenido a mi app con MVVM",
                "Mario Valadez"
            ),
        )
    }
}