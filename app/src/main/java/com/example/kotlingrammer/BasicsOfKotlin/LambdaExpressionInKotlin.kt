package com.example.kotlingrammer.BasicsOfKotlin

fun main(){

    println(add(12, 12 ))

    println(catAge(3))

}

/* A Normal Function to perform addition operation */

fun add(a: Int, b: Int): Int{
    return a+b
}

/* Lambda function to perform Addition */

var sum: (Int, Int) -> Unit = { a, b->  (a + b).toString() }

//val catAge: (Int) -> Int = {age -> age * 7}

val catAge:(Int) -> Int = { it*7 }