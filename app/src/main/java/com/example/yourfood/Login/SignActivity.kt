package com.example.yourfood.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourfood.R
import com.example.yourfood.databinding.ActivityLoginBinding
import com.example.yourfood.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alredyHaveAnAccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}