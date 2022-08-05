package com.vila.firstcomposoble

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

fun main(){
    testTime()
}

fun testTime(){
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    val now = sdf.format(System.currentTimeMillis())
    val minutesAgo =  sdf.format(System.currentTimeMillis()- 2*60*1000)
    val date = sdf.parse(now)
    val dateFormated = date!!.time
    val newDate :String = sdf.format(Date())
    println("mContro mi controls...${System.currentTimeMillis()} == $now")
    println("2 minutos atras...${System.currentTimeMillis()- 2*60*1000} == $minutesAgo")
    println("hora transformada ...${date} == $dateFormated")
    println("Fecha ...${newDate} ")


}