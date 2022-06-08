package com.mariovaladez.mvvm1.di

import android.content.Context
import androidx.room.Room
import com.mariovaladez.mvvm1.data.database.CitaDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val CITA_DATABASE_NAME = "cita_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context)=
        Room.databaseBuilder(context,CitaDatabase::class.java, CITA_DATABASE_NAME).build()


    @Singleton
    @Provides
    fun provideCitaDao(db:CitaDatabase) =db.getCitaDao()


}