package com.example.demo.kotlin
class Some {
    companion object{
        var count = 0
    }
    init {
        count++
        println("Создано объектов: $count")
    }
}

fun main() {
    val test = Some()
    val test2 = Some()
    val test3 = Some()
    val test4 = Some()

    Some.count = 99
    println(Some.count)


    val dbMySQL = Db.MySQL(1, "mysql")
    val postgreSQL = Db.PostgreSQL(2, "postgres", true)

    val db_copy = dbMySQL.copy()
    if(db_copy == dbMySQL){
        println("Равны")
    } else {
        println("Не равны")
    }
    val db_copy2 = dbMySQL.copy(connection = "Done")
    if(db_copy2 == dbMySQL){
        println("Равны")
    } else {
        println("Не равны")
    }

    postgreSQL.printInfo()
    dbMySQL.printInfo()

    println(dbMySQL.info)
    println()
    val list = listOf("Java", "PHP", "Perl", "JS")
    filterList(list, {it.length > 3})
    println()
    filterList(list) { it.length > 2 }
    println()
    filterList(list) {
        it.startsWith("J")
    }
    println()
    filterList(list, filter)
}

val filter: (String) -> Boolean = {
    it.startsWith("P")
}


//fun filterListInfo(list: List<String>, filter: (String)){
//    for (s in list) {
//        filter(s)
//    }
//}

fun filterList(list: List<String>, filter: (String) -> Boolean){
    list.forEach{ el ->
        if (filter(el)){
            println(el)
        }
    }
}