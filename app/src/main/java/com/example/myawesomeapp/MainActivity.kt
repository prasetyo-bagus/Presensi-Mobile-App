package com.example.myawesomeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myawesomeapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener{

            // EXPLICIT INTENT || PINDAH ANTAR ACTIVITY DALAM SATU APLIKASI
            val intent = Intent(this, LoginActivity::class.java)  /* -> membuka activity Login Activity */
            startActivity(intent)
        }

        // IMPLISIT INTENT || PINDAH ANTAR APLIKASI
        binding.btnWhatsApp.setOnClickListener {
            openUrl("https://siakad.pnm.ac.id/gate/login")
        }
    }

    private fun openUrl(link: String) {
        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intent)
    }
}