package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.QuoteRepository
import com.mariovaladez.mvvm1.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel> = repository.getallQuotes()


}