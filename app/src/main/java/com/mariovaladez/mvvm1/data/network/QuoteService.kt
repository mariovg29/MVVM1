package com.mariovaladez.mvvm1.data.network

import com.mariovaladez.mvvm1.core.RetrofitHelper
import com.mariovaladez.mvvm1.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun  getQuote():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response= retrofit.create(QuoteApiClient::class.java).gatAllQuotes()
            response.body() ?: emptyList()

        }

    }
}