package com.example.project

import org.jetbrains.annotations.NotNull

fun nullSafety(){
    var neverNull: String = "This can't be null"


    var nullable: String? = "You can keep a null here"

    nullable = null


    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inerredNodNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)


    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))

}
fun main(){
    nullSafety()
}
