package com.example.demo.kotlin

fun main() {
    val alex = User("Alex", "Marley")

    val john = User("John", "Doe")

    alex.printUser()
    john.printUser()

    alex.firstname = "Alexander"
//    alex._firstname ="Bobobo"

    alex.printUser()

//    println(alex._firstname)

    val piter = User()
    val star = User("Star")
    val dd = User(secondname = "Lica")
    piter.printUser()
    star.printUser()
    dd.printUser()

    alex.login = "log"
    println(alex.login)
    alex.login

    piter.login
}