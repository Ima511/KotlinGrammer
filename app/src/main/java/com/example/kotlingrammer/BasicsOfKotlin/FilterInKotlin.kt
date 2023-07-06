package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
    val myListOfNames = listOf<String>("James","Paul","Rafael","Gina")
    val found = myListOfNames.filter {
        it.startsWith("J") || it.startsWith("g",ignoreCase = true)
    }
    println(found)
}