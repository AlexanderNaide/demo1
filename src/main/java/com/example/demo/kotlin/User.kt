package com.example.demo.kotlin

class User(var firstname: String = "Peter", var secondname: String = "Patric") {
    //public - по умолчанию
    //internal - виден в пакете
    //private - виден только в классе
    //protected (только для полей, не для классов) - виден в классе и внутри классов наследников

//    var firstname: String

//    var secondName: String

//    init {
//        firstname = _firstname
//        secondName = _secondName
//    }

    var login: String? = null
        set(value){
            if (value == "log"){
                field = "newLogin"
            } else {
                field = value;
            }
        }
        get() {
            val loginField = field ?: "Неизвестно"
            println("Взяли $loginField")
            return field
        }
    fun printUser(){
        println("$firstname $secondname")
    }

//    constructor(): this("Piter", "Patrik")
//    constructor(): this("Piter", "Patrik"){
//        println("Глава семьи нарисовался")
//    }
//
//    constructor(firstname: String): this(firstname, "Patrik"){
//        println("В семейство Patric добавился $firstname")
//    }

}