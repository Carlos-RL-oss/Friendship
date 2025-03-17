package com.example.friendship.DiseñosChats

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.friendship.R
import com.example.friendship.R.layout.frame_ajustes_perfil

class EditarPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(frame_ajustes_perfil)


        val btn1: ImageButton = findViewById(R.id.botonRegresar)
        btn1.setOnClickListener {
            val ventana1 = Intent(this, Comunidad::class.java)
            startActivity(ventana1)

        }
    }


}