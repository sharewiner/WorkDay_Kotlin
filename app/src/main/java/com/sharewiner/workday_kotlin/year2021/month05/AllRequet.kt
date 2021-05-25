package com.sharewiner.workday_kotlin.year2021.month05

import android.util.Log
import java.net.URL

/**
 * Created By shao
 * on 5/21/21
 *
 * 描述:
 */
public class AllRequet(val url: String) {

    public fun run() {
        val valueString = URL(url).readText()
        Log.d(javaClass.simpleName, valueString)
    }

}