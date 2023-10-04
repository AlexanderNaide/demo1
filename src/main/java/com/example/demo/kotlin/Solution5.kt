package com.example.demo.kotlin

fun main() {
    printString("Hello")
    printMultiString("Hello")
    printMultiString("Hello", "Bro")
    printMultiString("Hello", "Bro", "Good day")

    printMultiString2("Hi","Hello")
    printMultiString2("Hi","Hello", "Bro")
    printMultiString2("Hi","Hello", "Bro", "Good day")

    var names = arrayOf("Bob", "John", "Alex")
    printMultiString2("Hi", *names)

    printMultiString2(str = arrayOf("two", "three"), hi = "One")
    printMultiString2(str = arrayOf("two", "three"))

    var i = 5
    while (i > 0){
        println(i)
        i--
    }

    do {
        println("Ta-da")
    } while (i == 5)

    for (i in 0..3){
        print("$i ")
    }
    println()

    for (i in 0..10 step 2){
        print("$i ")
    }
    println()

    for (i in 10 downTo 0 step 2){
        print("$i ")
    }
    println()

    for (e in 'a'..'z'){
        print("$e ")
    }
    println()

    for (e in 'z' downTo 'a' step 3){
        print("$e ")
    }
    println()

    var x = 20
    if (x in 5..30){
        println("Variable: $x")
    }

    if (x !in 5..30){
        println("Not variable: $x")
    }

}

fun printString(str: String){
    println(str)
}

fun printMultiString(vararg str: String){
    str.forEach { el -> print("$el ") }
    println()
}

fun printMultiString2(hi: String = "default", vararg str: String){
    print("$hi: ")
    str.forEach { el -> print("$el ") }
    println()
}