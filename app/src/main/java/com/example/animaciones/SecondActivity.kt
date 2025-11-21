package com.example.animaciones

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animaciones.databinding.ActivitySecondBinding

class SecondActivity :AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val fadeSlide = FadeSlideAnimation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ejecuta una animación de entrada al abrir la pantalla
        fadeSlide.mostrarVistaConAnimacion(binding.txtMensaje)

        // Botón que vuelve a la pantalla principal
        binding.btnVolver.setOnClickListener {
            finish()
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}
