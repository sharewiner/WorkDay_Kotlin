package com.sharewiner.workday_kotlin.year2021.month02

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sharewiner.workday_kotlin.R


class TryFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_first)


        val btn = findViewById<TextView>(R.id.tv_btn)
        btn.setOnClickListener { Toast.makeText(this, "第一次尝试", Toast.LENGTH_SHORT) }

    }


}