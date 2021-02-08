package com.sharewiner.workday_kotlin.year2021.month02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sharewiner.workday_kotlin.R

class AcLifeActivity : AppCompatActivity() {

    /** 第一步
     *  创建ac */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //定义ac的界面的布局
        setContentView(R.layout.activity_ac_life)
    }

    /** 第二步
     * onCreate退出后Activity进入"已启动"状态，并对用户可见。
     * 次回调包含activity进入前台与用户进行互动之前的准备工作*/
    override fun onStart() {
        super.onStart()
    }

    /** 第三步
     * 系统会在activity开始与用户互动之前调用次回调。
     * 此时，activity位于activity堆栈的顶部，并会捕获所有用户输入。
     * 应用的大部分核心功能都在onResume方法中实现*/
    override fun onResume() {
        super.onResume()
    }

    /***
     * 第三步
     * activity失去焦点并进入已暂停状态
     * 该状态正在消失或者正在开始显示
     * 不应该用onPause来保存应用或用户数据，进行网络呼叫，执行数据库事务
     * 消失操作下一步执行onStop
     * 显示操作下一步执行onResume
     */
    override fun onPause() {
        super.onPause()
    }

    /***
     * 第四步
     * 当activity对用户不可见时系统会调用onStop
     * 这种情况一般是activity被销毁新的activity已启动
     * 下一步是onRestart()回复或者onDestory()彻底终止
     */
    override fun onStop() {
        super.onStop()
    }

    /***
     * 第五步
     * 下一步是onStart
     */
    override fun onRestart() {
        super.onRestart()
    }

    /***
     * 第六步
     * 销毁
     */
    override fun onDestroy() {
        super.onDestroy()
    }


}