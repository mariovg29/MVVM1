package com.mariovaladez.mvvm1.data.model

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class CitasPrivider @Inject constructor(){

        var citas:List<CitasModel> = emptyList()



}