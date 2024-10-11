package com.example.project


fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

fun withDefaultParameter(name: String = "Jamal", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int{
    return println (panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "john", age = 30)
    withDefaultParameter(age = 25)

}