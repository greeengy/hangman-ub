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

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        val buttonBack: Button = findViewById(R.id.button_back2)

        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val predm: Button = findViewById(R.id.predm)

        predm.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        val terms: Button = findViewById(R.id.terms)

        terms.setOnClickListener {
            val intent = Intent(this, GameActivityT::class.java)
            startActivity(intent)
        }
        val society: Button = findViewById(R.id.society)

        society.setOnClickListener {
            val intent = Intent(this, GameActivityS::class.java)
            startActivity(intent)
        }
    }
}