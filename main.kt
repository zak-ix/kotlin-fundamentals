package com.rsk


fun main(args: Array<String>) {
    for (a: String in args) {
        println(a)
    }

    // typical variable var
    var value: Int = sum_val(5, 2)
    println(value)

    value = sum_val2(12, 56)
    println(value)

    // val is for values that never change. i.e const
    val count = 9
    when(count) {
        1 -> print("count is 1")
        2-> print("count is 2")
        else -> {
            print("count is unexpected")
        }
    }
}

fun sum_val(a: Int, b: Int): Int {
    return a + b
}

fun sum_val2(a: Int, b: Int) = a + b