package com.mariovaladez.mvvm1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.mariovaladez.mvvm1.databinding.ActivityMainBinding
import com.mariovaladez.mvvm1.viewModel.CitaViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val citaViewModel:CitaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        citaViewModel.citaModel.observe(this, Observer {currentCita->
            binding.tvQuote.text = currentCita.cita
            binding.tvAuthor.text = currentCita.author
        })

        binding.viewContainer.setOnClickListener { citaViewModel.randomCita() }

    }
}