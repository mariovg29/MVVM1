package com.mariovaladez.mvvm1.network

import com.mariovaladez.mvvm1.core.RetrofitHelper
import com.mariovaladez.mvvm1.data.model.CitasModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CitasService {
    private val retrofit= RetrofitHelper.getRetrofit()

    suspend fun getCitas():List<CitasModel>{
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(CitaApiClient::class.java).getAllCitas()
            response.body() ?: emptyList()
        }

    }
}