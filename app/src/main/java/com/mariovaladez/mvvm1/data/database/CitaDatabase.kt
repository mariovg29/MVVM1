package com.mariovaladez.mvvm1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mariovaladez.mvvm1.data.database.dao.CitaDao
import com.mariovaladez.mvvm1.data.database.entities.CitaEntity

@Database(entities=[CitaEntity::class], version = 1)
abstract class CitaDatabase : RoomDatabase(){

    abstract fun getCitaDao():CitaDao


}