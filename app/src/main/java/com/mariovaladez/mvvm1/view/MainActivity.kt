package com.mariovaladez.mvvm1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.mariovaladez.mvvm1.databinding.ActivityMainBinding
import com.mariovaladez.mvvm1.model.CitasModel
import com.mariovaladez.mvvm1.viewModel.view.CitasViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val citasViewModel:CitasViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        citasViewModel.citasModel.observe(this, Observer {
            binding.tvCita.text = it.cita
            binding.tvAutor.text = it.autor
        })
        binding.cvbackground.setOnClickListener { citasViewModel.obtenerCita() }
    }

}