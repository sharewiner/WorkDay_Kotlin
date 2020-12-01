package com.sharewiner.workday_kotlin.year2020.month08.day0814

/**
 * Created By shao
 * on 2020/8/14
 *
 * 描述:
 */
class Work01 {
    /*常量和变量*/
    //变量 var
    var a = 10
    var b: Int = 10

    //常量 val
    val c = 10
    val d: Int = 10
    val e: Int = 100

    /*函数*/
    //有返回值
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    //无返回值 Unit表示无返回值 也可以不写
    fun add(msg: String): Unit {
        println(msg)
    }

    /*注释*/
    /* 多行注释 */
    //单行注释

    /*数值类型*/
    //Byte           1      toByte()
    //Short          2      toShort()
    //Int            4      toInt()
    //Long           8      toLong()
    //Float          4      toFloat()
    //Double         8      toDouble()
    //                      toChar()
    var f: Int = 1
    var g: Long = 1L
    var h: Float = 0.1F
    var i: Double = 0.01

    fun change(a: Byte, b: Short, c: Int, d: Long, e: Float, f: Double) {
        var value0: Int
        value0 = a.toInt()
    }

    /*字符类型*/
    //char Java中a=95 可以字节看做数字，但是kotlin不行但可以使用toInt
    fun check(c: Char) {
        if (c.toInt() == 95) {

        }
    }

    /*转移符\*/
    // \t 制表符
    // \b 退格符
    // \n 换行符
    // \r 回车符
    // \' 单引号
    // \" 双引号
    // \\ 反斜杠
    /*数组*/
    //定义数组
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2 = intArrayOf(1, 2, 3, 4, 5)
    var arr3 = shortArrayOf(1, 2, 3, 4, 5)

    //函数定义数组
    var arrNull = arrayOfNulls<Int>(10)

    //构造器定义数组
    var arrMore = Array(10, { i -> (i * i).toString() })

    /*字符串 String*/
    //普通字符串 类似java 放在双引号对中 换行等操作需要转移字符\n
    var zifuString = "哈哈哈撒打\n发11人"

    //保留原始格式的字符串 放在三个引号对
    var moreString = """
        adada
        safaf
        awfafg
        啊哈哈
    """

    //字符串模板 $表示 内容可以后期指定
    var name = "哈哈"
    var note = "他的名字是：$name"
    var note1 = "他的名字长度是${name.length}个字"

    /*导包*/
    //类似java的导包
    //import a.b.month 导入a.b包中的一个资源
    //import a.b.month as f 导入a.b包中的一个资源并且取一个别名为f
    //import a.b.*     导入a.b包中的所有资源

    /*控制流*/
    //条件语句
    //if
    fun tiaojian() {
        var a = 100
        var b = 101
        var max: Int
        if (a > b) max = a
        max = if (a > b) a else b


    }

    //when
    fun tiaojian2(a: Int) {
        var note = when (a) {
            1 -> {
                println("one")
                "one"
            }
            2 -> {
                println("two")
                "two"
            }
            else -> {
                println("over")
                "over"
            }
        }
    }

    //for
    fun meijuFor() {
        var arr = intArrayOf(1, 2, 3, 4, 5)
        for (i: Int in arr) {
            println("输出${arr[i]}")
        }

        for ((index, value) in arr.withIndex()) {
            println("第$index 个的内容是$value")
        }
    }
}

class Hah {

}
