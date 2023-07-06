package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
/*
    val myListOfNames = listOf(
        "James",
        "Paul",
        "Rafael",
        "Gina")



    for (item in myListOfNames){
        println(item  + myListOfNames.indexOf(item))
    }

    myListOfNames.forEach {
        println(it +" "+ myListOfNames.indexOf(it))
    }

    print(myListOfNames)*/

  /*  val myMutableList = mutableListOf<Int>(12, 24, 45, 123)
    myMutableList.removeAt(0)
    println("Number of elements ${myMutableList.size}")
    println("Second Element ${myMutableList.get(1)}")
    println("Index of element \"two\" ${myMutableList.indexOf(45)}")
*/
  /*  val mySet = setOf<String>("US","MZ","AU")
    val myMutableSet = mutableSetOf<Int>(1,3,4,5)
    myMutableSet.add(6)
    println(mySet)*/

    // Map
    val secretMap = mapOf("Up" to 1,
        "Down" to 2,
        "Left" to 3,
        "Right" to 4)

    println(secretMap)

    println(secretMap.keys)
    println(secretMap.values)

    if ("Up" in secretMap){
        println("Yes is in!")
    }

    if (4 in secretMap.values){
        println("Yes is in!")
    }

    val myMutableSecretMap = mutableMapOf("One" to 1,
        "Two" to 2,
        "Three" to 3)

    myMutableSecretMap["Four"] = 4

    println(myMutableSecretMap.values)
}