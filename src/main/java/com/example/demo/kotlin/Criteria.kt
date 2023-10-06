package com.example.demo.kotlin

enum class Criteria(private val value: String) {
    NONE("n"),
    ABOVE("a"),
    BELOW("b");

    fun get() = name

    fun getVal(): String{
        println(value)
        return value
    }
}