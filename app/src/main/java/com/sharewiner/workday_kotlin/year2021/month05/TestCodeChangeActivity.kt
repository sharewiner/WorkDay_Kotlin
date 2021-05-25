package com.sharewiner.workday_kotlin.year2021.month05

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_code_change)
        rlv.layoutManager = LinearLayoutManager(this)
        initData()

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