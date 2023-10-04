package com.example.demo.kotlin

fun main(args: Array<String>) {
    var world: String? = null
    var isHasCar = true

    world = "World"
    if (world == null) {
        println("Null")
    } else {
        println("var = $world")
    }



    var num = 50

    when(num){
        null -> println("0")
        5 -> println("5")
        else -> println("--")
    }

    val res = if (num > 30) 1 else 0


    val words = when(num){
        null -> "Null"
        else -> num
    }

    println(words)
}