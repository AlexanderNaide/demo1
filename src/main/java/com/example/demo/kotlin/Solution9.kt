package com.example.demo.kotlin

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset


fun main(){
    var str = "%05d".format(1)
    println(str)
//    str = String.format("%05d", Integer.parseInt(str) + 1)
//    str = String.format("%05d", str.toInt() + 1)
    str = "%05d".format(str.toInt() + 1)
    println(str)

    val startData: LocalDateTime = LocalDateTime.of(LocalDate.of(2023, 10, 16), LocalTime.of(0, 0))
    val endData: LocalDateTime = LocalDateTime.of(LocalDate.of(2023, 10, 21), LocalTime.of(0, 0))
    val currentData: LocalDateTime = LocalDateTime.now()

    val startMilli = startData.toInstant(ZoneOffset.UTC).toEpochMilli()
    val endMilli = endData.toInstant(ZoneOffset.UTC).toEpochMilli()
    val currentMilli = currentData.toInstant(ZoneOffset.UTC).toEpochMilli()

    println(currentData.isAfter(endData))
    println((endMilli - currentMilli) < (endMilli - startMilli)/4)


}