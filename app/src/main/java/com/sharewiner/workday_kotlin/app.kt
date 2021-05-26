package com.sharewiner.workday_kotlin

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created By shao
 * on 5/25/21
 *
 * 描述:
 */
class app : Application() {

    companion object {
        private var instance: Application by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}