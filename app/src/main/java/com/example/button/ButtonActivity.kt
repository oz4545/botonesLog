package com.example.button

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.button.databinding.ActivityButtonBinding
import android.util.Log

class ButtonActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar listeners para los botones
        binding.holaMundoButton.setOnClickListener(this)
        binding.containedButton.setOnClickListener(this)
        binding.textButton.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.customButton.setOnClickListener(this)

        // Imprimir mensaje en Logcat al iniciar la actividad
        Log.d("ButtonActivity", "onCreate en uso")
    }

    override fun onClick(view: View) {
        // Acciones para cada botón
    }

    override fun onStart() {
        super.onStart()
        // Imprimir mensaje en Logcat al iniciar la actividad
        Log.d("ButtonActivity", "onStart en uso ")
    }

    override fun onResume() {
        super.onResume()
        // Imprimir mensaje en Logcat al resumir la actividad
        Log.d("ButtonActivity", "onResume en uso")
    }

    override fun onPause() {
        super.onPause()
        // Imprimir mensaje en Logcat al pausar la actividad
        Log.d("ButtonActivity", "onPause en uso")
    }

    override fun onStop() {
        super.onStop()
        // Imprimir mensaje en Logcat al detener la actividad
        Log.d("ButtonActivity", "onStop en uso")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Imprimir mensaje en Logcat al destruir la actividad
        Log.d("ButtonActivity", "onDestroy en uso")
    }

    override fun onRestart() {
        super.onRestart()
        // Imprimir mensaje en Logcat al reiniciar la actividad
        Log.d("ButtonActivity", "onRestart en uso")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
