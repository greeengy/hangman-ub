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

class KafChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iu_kaf_choice)
        val button_iu6: Button = findViewById(R.id.button_iu6)

        button_iu6.setOnClickListener {
            val intent = Intent(this, com.example.hangman.Menu::class.java)
            startActivity(intent)
        }

        val button_back_to_fac: Button = findViewById(R.id.button_back_to_fac)

        button_back_to_fac.setOnClickListener {
            val intent = Intent(this, com.example.hangman.FacChoice::class.java)
            startActivity(intent)
        }
    }
}