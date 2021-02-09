package com.sharewiner.workday_kotlin.year2021.month02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.sharewiner.workday_kotlin.R

class Try2Activity : AppCompatActivity(R.layout.activity_try_2) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            val transAction = supportFragmentManager.beginTransaction()
            val bundle = bundleOf("msg" to "有人吗")
            transAction.add(R.id.fcv_content, ExampleFragment::class.java, bundle)
            transAction.commit()
        }

    }

}