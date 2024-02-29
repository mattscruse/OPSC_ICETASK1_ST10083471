package com.example.opsc_icetask1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloWorldActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)


        val btnEnglish: Button = findViewById(R.id.btnEnglish)
        val btnSpanish: Button = findViewById(R.id.btnSpanish)
        val btnFrench: Button = findViewById(R.id.btnFrench)
        val btnGerman: Button = findViewById(R.id.btnGerman)
        val btnJapanese: Button = findViewById(R.id.btnJapanese)
        val textviewHelloworld: TextView = findViewById(R.id.textviewHelloworld)

            btnEnglish.setOnClickListener {
                // Change language to English
                "Hello World!".also { textviewHelloworld.text = it }

            }

            btnSpanish.setOnClickListener {
                // Change language to Spanish
                "Hello World!".also { textviewHelloworld.text = it }
            }

            btnFrench.setOnClickListener {
                // Change language to French
                // Replace this with your logic
            }

            btnGerman.setOnClickListener {
                // Change language to German
                // Replace this with your logic
            }

            btnJapanese.setOnClickListener {
                // Change language to Japanese
                // Replace this with your logic
            }
        }
    }