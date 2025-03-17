package com.example.friendship.DiseñosChats

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.friendship.R

class Buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btn = findViewById<Button>(R.id.btn)
        val etbuscar = findViewById<EditText>(R.id.etbuscar)

        btn.setOnClickListener {
            // Hacer que el EditText tenga el foco
            etbuscar.requestFocus()

            // Mostrar el teclado
            val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(etbuscar, InputMethodManager.SHOW_IMPLICIT)
        }

        val Button = findViewById<Button>(R.id.comentarios)
        Button.setOnClickListener {
            val ventana6 = Intent(this, Solicitudes::class.java)
            startActivity(ventana6)
        }


        val btn2 = findViewById<Button>(R.id.usuario)
        btn2.setOnClickListener {
            val ventana4 = Intent(this, CrearComunidad::class.java)
            startActivity(ventana4)
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)


    }
}