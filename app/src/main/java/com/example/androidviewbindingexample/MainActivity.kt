package com.example.androidviewbindingexample

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.androidviewbindingexample.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonId.setOnClickListener(View.OnClickListener {
            binding.textId.text = "THis is view binding👍"
        })

}

}