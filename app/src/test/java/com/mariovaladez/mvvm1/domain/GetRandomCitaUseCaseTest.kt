package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.CitasRepository
import com.mariovaladez.mvvm1.domain.model.Cita
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


internal class GetRandomCitaUseCaseTest{

    @RelaxedMockK
    private lateinit var citarepository : CitasRepository
    lateinit var getRandomCitaUseCase: GetRandomCitaUseCase


    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        getRandomCitaUseCase = GetRandomCitaUseCase(citarepository)


    }
    @Test
    fun  `when database is empty then return null`() = runBlocking{

        //Given
        coEvery { citarepository.getAllCitasFromDataBase()} returns emptyList()

        //When
        val response = getRandomCitaUseCase()

        //Then
        assert(response == null)

    }
    @Test
    fun `when database is not empty then return cita`() = runBlocking{

        //Given
        val citaList = listOf<Cita>(Cita("Hola","Mario"))
        coEvery { citarepository.getAllCitasFromDataBase() } returns citaList

        //When
        val response = getRandomCitaUseCase()

        //Then
        assert(response == citaList.first())


    }
}