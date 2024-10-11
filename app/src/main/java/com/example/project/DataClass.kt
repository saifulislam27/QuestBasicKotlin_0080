package com.example.project


data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "jamal@gmail.com")
    println(data)

    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2)

    val data3 = data.copy()
    println(data3)

    val data4 = data.copy(email = "gahar@gmail.com")
    println(data4)
}