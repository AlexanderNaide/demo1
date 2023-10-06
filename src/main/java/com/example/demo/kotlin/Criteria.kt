package com.example.demo.kotlin

enum class Criteria(name: String) {
    NONE("n"),
    ABOVE("a"),
    BELOW("b");

    fun get() = name

    fun getVal(): String{
        println(name)
        return name
    }
}