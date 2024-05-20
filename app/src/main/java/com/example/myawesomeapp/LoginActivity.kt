package com.example.myawesomeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myawesomeapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val inputUsername : EditText = findViewById(R.id.input_username)
//        val inputNim : EditText = findViewById(R.id.input_nim)
//        val inputPassword : EditText = findViewById(R.id.input_password)
//        val btnLogin : Button = findViewById(R.id.btn_login)

        binding.btnLogin.setOnClickListener{
            val usernameString = binding.inputUsername.text.toString()
            val nimString = binding.inputNim.text.toString()
            val passwordString = binding.inputPassword.text.toString()

            if(validateInput(usernameString, nimString, passwordString)){
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                loginSuccess()
            } else {
                loginError()
            }
        }
    }

    fun validateInput(username: String, nim: String, password: String) : Boolean {

        /*
        // validate username hanya bisa memasukkan huruf
        val regex = Regex ("^[a-zA-Z ]+$")
        val isUsernameValid = regex.matches(username)
        val isNimValid = nim.isNotBlank() && nim.length >= 7
        val isPasswordValid = password.length >= 6

        return isUsernameValid && isNimValid && isPasswordValid
        */

        // hardcode validate user
        val isUsernameValid = username == "Bagus Prasetyo"
        val isNimValid = nim == "233307096"
        val isPasswordValid = password == "123"

        return isUsernameValid && isNimValid && isPasswordValid
    }


    private fun loginError() {
        Toast.makeText(this, "Masukkan Data Yang Valid", Toast.LENGTH_LONG).show()
    }

    private fun loginSuccess() {
        Toast.makeText(this, "Selamat Login Berhasil", Toast.LENGTH_LONG).show()
    }
}