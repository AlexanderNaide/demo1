package com.example.demo.kotlin

open class MainProvider: AbstractMainProvider() {

    override val info: String
        get() = "Message"

    override fun printInfo(user: User) {
        user.printUser()
    }
}