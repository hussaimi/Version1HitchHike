package com.example.hitchhike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addTripButton = findViewById<Button>(R.id.addTripButton);
        addTripButton.setOnClickListener {
            Toast.makeText(this, "Testing", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, AddTrip::class.java).apply {
            }
            startActivity(intent)
        }

    }
}