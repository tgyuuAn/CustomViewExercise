package com.example.viewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.viewexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var flag = MIDDLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun log(str: String) = Log.d("tgyuu", str)

    companion object{
        const val LEFT = 0
        const val MIDDLE = 1
        const val RIGHT = 2
    }
}