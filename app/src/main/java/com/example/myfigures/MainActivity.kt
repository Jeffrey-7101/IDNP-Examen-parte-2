package com.example.myfigures

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var drawView: DrawView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd: Button = findViewById(R.id.btnAddSide)
        val btnReset: Button = findViewById(R.id.btnReset)

        drawView = findViewById(R.id.drawView) // Inicializar drawView con la instancia de DrawView

        // Manejar el botón para agregar un lado más
        btnAdd.setOnClickListener {
            drawView.addShape()
        }

        // Manejar el botón para resetear
        btnReset.setOnClickListener {
            drawView.reset()
        }
    }
}
