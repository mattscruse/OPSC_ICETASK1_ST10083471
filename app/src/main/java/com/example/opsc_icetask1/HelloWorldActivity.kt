package com.example.opsc_icetask1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloWorldActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        //Declaring varibables for buttons and text box
            val btnEnglish: Button = findViewById(R.id.btnEnglish)
            val btnSpanish: Button = findViewById(R.id.btnSpanish)
            val btnFrench: Button = findViewById(R.id.btnFrench)
            val btnGerman: Button = findViewById(R.id.btnGerman)
            val btnJapanese: Button = findViewById(R.id.btnJapanese)
            val textviewHelloworld: TextView = findViewById(R.id.textviewHelloworld)


        // Sets the Hello World Text box to English
            btnEnglish.setOnClickListener {
                // Change language to English
                "Hello World!".also { textviewHelloworld.text = it }

            }
        // Sets the Hello World Text box to Spanish
            btnSpanish.setOnClickListener {
                // Change language to Spanish
                "Hola Mundo!".also { textviewHelloworld.text = it }
            }

        // Sets the Hello World Text box to French
            btnFrench.setOnClickListener {
                // Change language to French
                "Bonjour le monde!".also { textviewHelloworld.text = it }
            }

        // Sets the Hello World Text box to German
            btnGerman.setOnClickListener {
                // Change language to German
                        "Hallo Welt!".also { textviewHelloworld.text = it }

            }

        // Sets the Hello World Text box to Japanese
            btnJapanese.setOnClickListener {
                // Change language to Japanese
                "こんにちは世界!".also { textviewHelloworld.text = it }
            }
        }
    }