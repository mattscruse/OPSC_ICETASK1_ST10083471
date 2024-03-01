package com.example.opsc_icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnNavigateToHelloWorld: Button = findViewById(R.id.btnNavigateToHelloWorld)

        //Setting on click listener for the first button on splash screen
        btnNavigateToHelloWorld.setOnClickListener {
            val intent = Intent(this, HelloWorldActivity::class.java)
            startActivity(intent)
        }
    }
}