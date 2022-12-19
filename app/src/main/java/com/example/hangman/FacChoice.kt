package com.example.hangman

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class FacChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fac_choice)
        val button_iu: Button = findViewById(R.id.button_iu)

        button_iu.setOnClickListener {
            val intent = Intent(this, com.example.hangman.KafChoice::class.java)
            startActivity(intent)
        }
        val button_back_to_start: Button = findViewById(R.id.button_back_to_start)

        button_back_to_start.setOnClickListener {
            val intent = Intent(this, com.example.hangman.MainActivity::class.java)
            startActivity(intent)
        }
    }
}