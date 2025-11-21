package com.example.animaciones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animaciones.databinding.ActivityMainBinding

class MainActivity :AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val animHelper = AnimationHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botón que ejecuta la animación
        binding.btnAnimar.setOnClickListener {
            animHelper.animarVista(binding.imageView)
        }

        // Botón que navega a la segunda pantalla
        binding.btnIrSegunda.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}
