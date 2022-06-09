package com.mariovaladez.mvvm1.ui.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.mariovaladez.mvvm1.domain.GetCitasUseCase
import com.mariovaladez.mvvm1.domain.GetRandomCitaUseCase
import com.mariovaladez.mvvm1.domain.model.Cita
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi


internal class CitasViewModelTest{

    @RelaxedMockK
    private lateinit var getCitasUseCase: GetCitasUseCase

    @RelaxedMockK
    private lateinit var  getRandomCitaUseCase: GetRandomCitaUseCase

    private lateinit var citasViewModel: CitasViewModel

    @get:Rule
    var rule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        citasViewModel = CitasViewModel(getCitasUseCase,getRandomCitaUseCase)
        Dispatchers.setMain(Dispatchers.Unconfined)
    }

    @After
    fun onAfter(){
        Dispatchers.resetMain()

    }

    @Test
    fun `when viewmodel is created at the first time, get all citas and set the first value`()=
        runTest{
            //Given
            val citaList = listOf<Cita>(Cita("hola", "mario"), Cita("adios", "mario"))
            coEvery { getCitasUseCase() } returns citaList

            //When
            citasViewModel.onCreate()

            //Then
            assert(citasViewModel.citasModel.value == citaList.first())

        }
    @Test
    fun `when randomCitasUseCase returns a cita set it on the livedata`()= runTest{

        //Given
        val cita = Cita("hola hola", "Mario vg")
        coEvery { getRandomCitaUseCase() } returns cita

        //When
        citasViewModel.citaAleatoria()

        //Then
        assert(citasViewModel.citasModel.value == cita )


    }
    @Test
    fun `if randomCitasUseCase returns null keep the last value`()= runTest {

        //Given
        val cita = Cita("hola hola", "Mario vg")
        citasViewModel.citasModel.value= cita
        coEvery { getRandomCitaUseCase() } returns null

        //When
        citasViewModel.citaAleatoria()

        //Then
        assert(citasViewModel.citasModel.value == cita)


    }


}