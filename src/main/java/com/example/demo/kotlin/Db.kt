package com.example.demo.kotlin

sealed class Db {
    data class MySQL(val id: Int, val connection: String): Db()
    data class MongoDb(val id: Int, val connection: String): Db()
    data class PostgreSQL(val id: Int, val connection: String, val isDone: Boolean): Db() {
        fun printInfo(){
            println("""
                
                id: $id
                connection: $connection
                isDone: $isDone
            """.trimIndent())
        }
    }
    data object Help: Db(){
        val connection = "Connection done"
    }
}

fun Db.MySQL.printInfo(){
    println("""
                
                id: $id
                connection: $connection
            """.trimIndent())
}

val Db.MySQL.info: String
    get() = "MySql Data Base Connection"

