package com.example.friendship.DiseñosChats

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.friendship.R

class MisComunidades : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mis_comunidades)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referenciar el ImageButton por su ID
        val btnProgramacion = findViewById<ImageButton>(R.id.programacion)

        // Asignar un evento de clic
        btnProgramacion.setOnClickListener {
            // Navegar a otra actividad (ejemplo)
            val intent = Intent(this, Comunidad::class.java)
            startActivity(intent)
        }


    }
}