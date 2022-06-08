package com.mariovaladez.mvvm1.di

import com.mariovaladez.mvvm1.network.CitaApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)//Activity
object NetworkModule {

    //Proveo Retrofit
    @Singleton
    @Provides
    fun providerRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideCitaApiClient(retrofit: Retrofit):CitaApiClient{
        return retrofit.create(CitaApiClient::class.java)

    }
}