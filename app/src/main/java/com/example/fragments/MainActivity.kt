package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 :Button = findViewById(R.id.btnFragment1);
        val btn2 :Button = findViewById(R.id.btnFragment2);

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,firstFragment)
            commit()
        }

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondFragment)
                addToBackStack(null)
                commit()
            }
        }


    }
}