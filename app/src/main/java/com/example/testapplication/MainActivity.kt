package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.data.remote.model.CarApiModel
import com.example.testapplication.data.remote.model.Products
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val list = listOf<Products>()
        }
    }
}