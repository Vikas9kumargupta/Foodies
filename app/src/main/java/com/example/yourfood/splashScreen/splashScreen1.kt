package com.example.yourfood.splashScreen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.yourfood.MainActivity
import com.example.yourfood.R
import com.example.yourfood.databinding.ActivitySplashScreen1Binding


class SplashScreen1 : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreen1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, StartScreen::class.java)
            startActivity(intent)
            finish() // Close the splash screen activity
        }, 2200)
    }
}
