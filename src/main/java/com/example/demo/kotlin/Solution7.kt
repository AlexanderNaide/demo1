package com.example.demo.kotlin

fun main() {
    var user = User()
    var provider = SecondProvider()
    provider.printInfo(user)
    println(user.login)
    provider.setLogin(user)
    println(user.login)

    println()
    println(provider.info)

    val animal = Animals.CAT
    println(animal.name)
    println(animal.toLowerCase())

    val criteriaN = Criteria.NONE

    val criteriaA = Criteria.ABOVE

    println(">>>>>>>>>>>>")
    println(criteriaN)
//    println(criteriaN.value())
    println(criteriaN.name)
    println(criteriaN.getVal())

    println(Criteria.fromValue("n"))


}

fun checkDataTypes(obj: MainProvider){
    when(obj){
        is UserInfoProvider -> obj.printInfo(User())
        is MainProvider -> obj.info
    }

}