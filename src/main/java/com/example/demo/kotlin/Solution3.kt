package com.example.demo.kotlin

fun main(args: Array<String>){
    say()
    sayName("Sanya", 5)
    println(add(5, 12))
    println(getVal())
    println(addNew(50, 120))
}

fun say(){
    println("Hello world")
}

fun sayName(name: String, number: Int){
    println("Hello $name - $number")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun getVal(): String = "Ta-da"

fun addNew(a: Int, b: Int): Int = a + b