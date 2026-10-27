package com.example.kiemtra_laptrinhungdungdidong_2274802010499

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvEmail: TextView
    private lateinit var btnLogout: Button
    private lateinit var listViewSkills: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tvEmail = findViewById(R.id.tvEmail)
        btnLogout = findViewById(R.id.btnLogout)
        listViewSkills = findViewById(R.id.listViewSkills)

        val email = intent.getStringExtra("EMAIL")
        tvEmail.text = email

        btnLogout.setOnClickListener {
            finish()
        }

        val skills = arrayOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            skills
        )

        listViewSkills.adapter = adapter

        listViewSkills.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(
                this,
                skills[position],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}