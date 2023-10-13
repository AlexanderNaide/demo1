package com.example.demo.kotlin

enum class Criteria(private val value: String) {
    NONE("n"),
    ABOVE("a"),
    BELOW("b");

    fun value() = value

    fun getVal(): String{
//        println(value)
        return value
    }

    companion object{
        fun fromValue(v: String) : Criteria {
            return entries.first { criteria -> criteria.value == v }
        }
    }

}