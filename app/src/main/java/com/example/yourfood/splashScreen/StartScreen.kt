package com.example.yourfood.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourfood.Login.LoginActivity
import com.example.yourfood.R
import com.example.yourfood.databinding.ActivityStartScreenBinding

class StartScreen : AppCompatActivity() {

    private  lateinit var binding : ActivityStartScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}