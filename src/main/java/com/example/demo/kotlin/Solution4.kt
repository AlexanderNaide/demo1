package com.example.demo.kotlin

fun main() {
    var items: Array<Int> = arrayOf(5, 7, 4, 0, 1)
    println(items[0])
    println(items.get(1))
    println(items.size)
    items.set(0, 45)
    println(items[0])

    for (el in items){
        print("$el ")
    }

    println()
    val strArray = arrayOf("One")
    val bolArray = arrayOf(true, false, true)

    items.forEach {
        el -> print("$el ")
    }

    println()
    items.forEachIndexed { index, i -> print("$index / $i; ") }

    println()
    var list: List<Int> = listOf(5, 55, 99, 77, 55)
    println(list.indexOf(55))
    println(list.lastIndexOf(55))

    var user: Map<String, String> = mapOf("name" to "Bob", "age" to "45", "drive" to "true")
    var superUser: Map<String, Any> = mapOf("name" to "Bob", "age" to 45, "drive" to true)
    var superUserNew = mapOf("name" to "Bob", "age" to 45, "drive" to true)

    println()
    superUserNew.forEach { key, value -> println("$key: $value") }

//    list.add(100)

    var mutableList = mutableListOf(5, 55, 99, 77, 55)
    mutableList.add(100)
    println()
    mutableList.forEachIndexed { index, i -> print("$index / $i; ") }
    var mutableSuperUserNew = mutableMapOf("name" to "Bob", "age" to 45, "drive" to true)
    printArray(mutableList)

}

fun printArray(items: List<Any>){
    println()
    items.forEach { el -> print("$el ") }
}