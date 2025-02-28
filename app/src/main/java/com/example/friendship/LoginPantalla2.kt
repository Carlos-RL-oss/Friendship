package com.example.friendship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_pantalla2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //conectar login
        val btn:Button = findViewById(R.id.login)
        btn.setOnClickListener{
            val ventana = Intent(this,LoginPantalla3::class.java)
            startActivity(ventana)
        }

        //conectar register
        val btn1:Button = findViewById(R.id.registro)
        btn1.setOnClickListener{
            val ventana1 = Intent(this,RegisterPantalla4::class.java)
            startActivity(ventana1)
        }
    }
}