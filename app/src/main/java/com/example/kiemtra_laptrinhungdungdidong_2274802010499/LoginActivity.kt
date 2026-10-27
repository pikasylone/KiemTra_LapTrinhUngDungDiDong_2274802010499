package com.example.kiemtra_laptrinhungdungdidong_2274802010499

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvStatus = findViewById(R.id.tvStatus)

        btnLogin.setOnClickListener {

            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString()

            if (email.isEmpty()) {
                tvStatus.text = "Email không được để trống"
            } else if (password.isEmpty()) {
                tvStatus.text = "Mật khẩu không được để trống"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Email không hợp lệ"
            } else if (password.length < 6) {
                tvStatus.text = "Mật khẩu phải có ít nhất 6 ký tự"
            } else {
                tvStatus.text = "Xác thực thành công!"
            }
        }
    }
}