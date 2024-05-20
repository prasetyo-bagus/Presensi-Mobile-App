package com.example.myawesomeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myawesomeapp.databinding.ActivityDashboardBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentTime = Calendar.getInstance().time
        val formatTanggal = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val jamTerkini = formatTanggal.format(currentTime)

        binding.currentTime.text = jamTerkini

        binding.groupPresensi.visibility = View.GONE

        var textVisible = false

        binding.btnPresensi.setOnClickListener {
            if (textVisible) {
                binding.groupPresensi.visibility = View.GONE
                textVisible = false
                binding.btnPresensi.setText(R.string.submit_presensi)
            } else {
                binding.groupPresensi.visibility = View.VISIBLE
                textVisible = true
                binding.btnPresensi.setText(R.string.hide_presensi)
            }
        }

        binding.btnInfoKelas.setOnClickListener {
            val intent = Intent(this, DetailKelasActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogout.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
