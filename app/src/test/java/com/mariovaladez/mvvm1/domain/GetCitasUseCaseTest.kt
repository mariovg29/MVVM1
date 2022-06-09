package com.mariovaladez.mvvm1.domain

import com.mariovaladez.mvvm1.data.CitasRepository
import com.mariovaladez.mvvm1.domain.model.Cita
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


internal class GetCitasUseCaseTest{


    @RelaxedMockK
    private lateinit var citarepository : CitasRepository
    lateinit var getCitasUseCase: GetCitasUseCase

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        getCitasUseCase = GetCitasUseCase(citarepository)

    }

    @Test
    fun `when The Api Doesnt Return Anything Then Get Values From Database`()= runBlocking{
        //Given
        coEvery { citarepository.getAllCitasFromApi() }returns emptyList()

        //When
        getCitasUseCase()

        //Then
        coVerify(exactly = 1) { citarepository.getAllCitasFromDataBase() }

    }

    @Test
    fun `when the api returns something then get values from api`() = runBlocking {

        //Given
        val myList = listOf<Cita>(Cita("Mario Valadez","Yooooo"))
        coEvery { citarepository.getAllCitasFromApi() }returns myList
        coVerify (exactly = 0){ citarepository.clearCitas() }
        coVerify (exactly = 0){ citarepository.insetCitas(any()) }

        //When
        val response = getCitasUseCase()

        //Then
        coVerify (exactly = 1){ citarepository.clearCitas() }
        coVerify (exactly = 1){ citarepository.insetCitas(any()) }
        coVerify (exactly = 0){ citarepository.getAllCitasFromDataBase() }
        assert(myList==response)

    }
}