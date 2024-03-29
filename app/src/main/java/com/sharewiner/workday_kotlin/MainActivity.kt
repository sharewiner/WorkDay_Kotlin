package com.sharewiner.workday_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import com.sharewiner.workday_kotlin.year2021.month02.Try2Activity
import com.sharewiner.workday_kotlin.year2021.month05.TestCodeChangeActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var btn_1: TextView
    lateinit var btn_2: TextView
    lateinit var fl_content: FragmentContainerView

    //重写的父类的方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)

        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)

        fl_content = findViewById(R.id.fl_content)
        fl_content

    }

    override fun onClick(v: View?) {
        if (v == btn_1) {
//            intent = Intent(this, TryFirstActivity::class.java)
//            intent = Intent(this, TryFirstActivity::class.java).apply {
//                putExtra(
//                    "Key_name",
//                    "sh_winer"
//                )
//            }
            val intent = Intent(this, TestCodeChangeActivity::class.java)
            startActivity(intent)

        } else if (v == btn_2) {
            //发送邮件
//            val emailIntent = Intent(Intent.ACTION_SEND).apply { putExtra(Intent.EXTRA_EMAIL, "啊哈哈哈") }
//            startActivity(intent2)
            //发送带有附件的电子邮件
            val emailIntent: Intent = Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_EMAIL, arrayOf("603032132@qq.com"))
                putExtra(Intent.EXTRA_SUBJECT, "EAF")
                putExtra(Intent.EXTRA_TEXT, "你好")
                putExtra(Intent.EXTRA_STREAM, Uri.parse("awdafafaffa"))
            }
            //打电话
            val callIntent: Intent =
                Uri.parse("tel:5551234").let { number -> Intent(Intent.ACTION_CALL, number) }
            startActivity(callIntent)

            //查看地图
            val mapIntent: Intent =
                Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
                    .let { location -> Intent(Intent.ACTION_VIEW, location) }
            startActivity(mapIntent)

            //查看网页
            val viewIntent: Intent =
                Uri.parse("wwww.baidu.com").let { path -> Intent(Intent.ACTION_VIEW, path) }
            startActivity(viewIntent)


        }
    }
}