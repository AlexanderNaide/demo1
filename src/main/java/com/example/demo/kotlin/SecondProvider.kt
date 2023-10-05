package com.example.demo.kotlin

class SecondProvider : MainProvider() {
    override val info: String
        get() = "Новый Мессаже"
}