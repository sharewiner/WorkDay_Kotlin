package com.sharewiner.workday_kotlin.year2020.month08.day0821

/**
 * Created By shao
 * on 2020/8/21
 *
 * 描述:
 */
class Work01 {

}


class Singleton private constructor() {
    public var value: Singleton? = null

    private object mHolder {
        val INSTANCE = Singleton()
    }

    companion object Factory {
        fun getInstance(): Singleton {
            return mHolder.INSTANCE;
        }
    }

}