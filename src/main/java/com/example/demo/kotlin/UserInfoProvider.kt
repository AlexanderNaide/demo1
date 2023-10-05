package com.example.demo.kotlin

interface UserInfoProvider {

    val info: String
    fun printInfo(user: User)

    fun setLogin(user: User){
        user.login = "LoLoLogin"
    }
}