package com.mariovaladez.mvvm1.data.network

import com.mariovaladez.mvvm1.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET(".json")
    suspend fun gatAllQuotes():Response<List<QuoteModel>>
}