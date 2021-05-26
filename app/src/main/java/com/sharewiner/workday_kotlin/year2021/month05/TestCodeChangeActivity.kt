package com.sharewiner.workday_kotlin.year2021.month05

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sharewiner.workday_kotlin.R
import kotlinx.android.synthetic.main.activity_test_code_change.*
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.uiThread


/**
 * Created By shao
 * on 5/21/21
 *
 *
 * 描述:
 */
open class TestCodeChangeActivity : AppCompatActivity() {

    @SuppressLint("Assert")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_code_change)
        rlv.layoutManager = LinearLayoutManager(this)
        initData()


        var list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        assert(list.any { it % 2 == 0 })
        assert(list.any { it > 10 })

        assert(list.all { it < 10 })
        assert(list.all { it % 2 == 0 })

        list.forEach { println(it) }
        list.forEachIndexed { index, i -> println("$index 和$i") }
        list.max()
        list.min()

        list.maxBy { it / 2 }
        list.flatMap { listOf(it, it + 1) }




    }

    fun initData() {
        async {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                rlv.adapter = TestCodeChangeAdapter(result)
            }
        }
    }


}