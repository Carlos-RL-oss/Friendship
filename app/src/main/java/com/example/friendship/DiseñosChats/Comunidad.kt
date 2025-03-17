package com.example.friendship.DiseñosChats

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.friendship.R
import com.example.friendship.R.id.main
import android.widget.Button as Button1


class Comunidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comunidad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button1 = findViewById(R.id.btnhome)
        btn.setOnClickListener {
            val ventana3 = Intent(this, Chats::class.java)
            startActivity(ventana3)
        }

        val spinner: Spinner = findViewById(R.id.btnmenu2) // Obtén la referencia del Spinner

        // Crea un ArrayAdapter usando el array de strings y un layout por defecto para el Spinner
        val adapter = ArrayAdapter.createFromResource(
            this, // Contexto
            R.array.opciones, // Array de opciones
            android.R.layout.simple_spinner_item // Layout por defecto para cada opción
        )

        // Especifica el layout que se usará cuando se despliegue el menú
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Aplica el Adapter al Spinner
        spinner.adapter = adapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Obtén el valor seleccionado
                val seleccion = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@Comunidad, "Seleccionaste: $seleccion", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Acción cuando no se selecciona nada
            }
        }


    }


}