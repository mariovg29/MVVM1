package com.mariovaladez.mvvm1.network

import com.mariovaladez.mvvm1.core.RetrofitHelper
import com.mariovaladez.mvvm1.data.model.CitasModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CitasService @Inject constructor(private val api:CitaApiClient){
    private val retrofit= RetrofitHelper.getRetrofit()

    suspend fun getCitas():List<CitasModel>{
        return withContext(Dispatchers.IO) {
            val response = api.getAllCitas()
            response.body() ?: emptyList()
        }

    }
}