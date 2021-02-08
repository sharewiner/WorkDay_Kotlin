package com.sharewiner.workday_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.sharewiner.workday_kotlin.year2021.month02.TryFirstActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var btn_1: TextView
    lateinit var btn_2: TextView

    //重写的父类的方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)

        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v == btn_1) {
            val intent1 = Intent(this, TryFirstActivity::class.java)
            startActivity(intent1)
        } else if (v == btn_2) {
            val intent2 = Intent(Intent.ACTION_SEND).apply { putExtra(Intent.EXTRA_EMAIL, "啊哈哈哈") }
            startActivity(intent2)
        }
    }
}