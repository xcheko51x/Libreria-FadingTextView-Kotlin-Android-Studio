package com.example.fadingtextviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fadingtextviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var textos = arrayListOf<String>()

        binding.btnAgregar.setOnClickListener {
            textos.add(binding.etTexto.text.toString())
            binding.etTexto.text = null
        }

        binding.btnMostrar.setOnClickListener {
            val listaTextos = textos.toTypedArray()
            binding.ftv.setTexts(listaTextos)
        }

    }
}