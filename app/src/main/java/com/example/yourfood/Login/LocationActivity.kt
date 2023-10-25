package com.example.yourfood.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.yourfood.R
import com.example.yourfood.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locationList : Array<String> = arrayOf("Delhi", "Jaipur", "Mumbai", "Ghaziabad", "Gorakhpur", "Lucknow"," Chennai");

        val adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation

        autoCompleteTextView.setAdapter(adapter)
    }
}