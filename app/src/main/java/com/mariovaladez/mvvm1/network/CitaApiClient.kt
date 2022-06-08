package com.mariovaladez.mvvm1.network

import com.mariovaladez.mvvm1.data.model.CitasModel
import retrofit2.Response
import retrofit2.http.GET

interface CitaApiClient {
    @GET("/.json")
    suspend fun getAllCitas(): Response<List<CitasModel>>
}