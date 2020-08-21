package com.sharewiner.workday_kotlin.day0814

/**
 * Created By shao
 * on 2020/8/14
 *
 * 描述:
 */
class Work02 {
}

/*类 class*/
//主构造方法 constructor 在没有任何修饰符和注释的情况下可以省略 主构造器方法直接更在类名后面 方法在init代码块中实现

class Person constructor(name: String, age: Int) {
    init {
        println("用户年纪$age ；用户姓名$name")

    }




}