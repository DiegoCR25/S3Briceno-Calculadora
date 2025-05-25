package com.example.s3briceo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valA = findViewById<EditText>(R.id.etValorA)
        val valB = findViewById<EditText>(R.id.etValorB)
        val valC = findViewById<EditText>(R.id.etValorC)
        val btnSum = findViewById<Button>(R.id.btnSumar)
        val btnRes = findViewById<Button>(R.id.btnRestar)
        val btnMul = findViewById<Button>(R.id.btnMultiplicar)
        val btnDiv = findViewById<Button>(R.id.btnDividir)
        val tvRest = findViewById<TextView>(R.id.tvResultado)

        btnSum.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                val result = a.toDouble() + b.toDouble() + c.toDouble()
                tvRest.text = "Resultado: $result"

            }
        }

        btnRes.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                val result = a.toDouble() - b.toDouble() - c.toDouble()
                tvRest.text = "Resultado: $result"

            }
        }

        btnMul.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                val result = a.toDouble() * b.toDouble() * c.toDouble()
                tvRest.text = "Resultado: $result"

            }
        }

        btnDiv.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                val result = a.toDouble() / b.toDouble() / c.toDouble()
                tvRest.text = "Resultado: $result"

            }
        }

    }
}