package com.example.lab3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_3.databinding.Activity3Binding

class activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToSecond.setOnClickListener {
            setResult(2)
            finish()
        }

        binding.btnToFirst.setOnClickListener {
            val intent = Intent(this, activity1::class.java, )
            intent.flags = Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP
            startActivity(intent)
        }

        binding.btnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToAbout() {
        val intent = Intent(this, activityAbout::class.java)
        startActivity(intent)
    }
}