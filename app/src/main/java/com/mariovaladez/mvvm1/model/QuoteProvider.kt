package com.mariovaladez.mvvm1.model

class QuoteProvider {

    fun random():QuoteModel{
        val position = (0..7).random()
        return quote[position]
    }

    companion object{
       private  val quote = listOf<QuoteModel>(
            QuoteModel(
                "1 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "2 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "3 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "4 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "5 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "6 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "7 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),
            QuoteModel(
                "8 It's not a Bug.Its an undocumented feature!",
                "Mario Valadez"
            ),


            )

    }


}