package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.model.QuoteModel
import com.mariovaladez.mvvm1.data.model.QuoteProvider

class GetRandomQuoteUseCase {



    operator fun invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if (quotes.isNullOrEmpty()){
            //val randomNumber = (0..quotes.size-1).random()
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]

        }
        return null
    }

}