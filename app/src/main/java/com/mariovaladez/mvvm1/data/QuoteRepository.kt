package com.mariovaladez.mvvm1.data

import com.mariovaladez.mvvm1.data.model.QuoteModel
import com.mariovaladez.mvvm1.data.model.QuoteProvider
import com.mariovaladez.mvvm1.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getallQuotes(): List<QuoteModel>{
        val response= api.getQuote()
        QuoteProvider.quotes =response
        return response
    }
}