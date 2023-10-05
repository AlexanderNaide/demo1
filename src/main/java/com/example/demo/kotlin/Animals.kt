package com.example.demo.kotlin

import java.util.*

enum class Animals {
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.lowercase(Locale.getDefault())
}