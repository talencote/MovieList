package com.talencote.movielist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hellowrld: TextView = findViewById(R.id.hellowrld)

        hellowrld.setOnClickListener { moveToDetailsActivity() }
    }

    private fun moveToDetailsActivity() {

        val intent = Intent(this, MovieDetailsActivity::class.java)

        startActivity(intent)
    }
}