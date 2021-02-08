package com.sharewiner.workday_kotlin.year2021.month02

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun sum2(a: Int, b: Int): Unit {
    print(a + b)
}

fun sum3(a: Int, b: Int) {
    print(a + b)
}

fun sum4(vararg a: Int) {
    for (tv in a) {
        print(tv)
    }
}

fun sum5(arys: Array<String>) {
    sum4(1, 2, 3, 4, 5, 6, 7, 8)
}


fun sum6(arys: Array<String>) {
    val sum7: (Int, Int) -> Int = { x, y -> x + y }
}




