package com.mariovaladez.mvvm1.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.mariovaladez.mvvm1.databinding.ActivityMainBinding
import com.mariovaladez.mvvm1.ui.viewModel.CitasViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val citasViewModel:CitasViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        citasViewModel.onCreate()


        citasViewModel.citasModel.observe(this, Observer {
            binding.tvCita.text= it.cita
            binding.tvAutor.text= it.autor
        })
        citasViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible = it
        })

        binding.clfondo.setOnClickListener { citasViewModel.citaAleatoria() }

    }
}