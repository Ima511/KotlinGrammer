package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
/*
    val person = Person(
        name = "Joe",
        lastName = "Ball",
        age = 23
    )

    println(person)*/

    val listOfPeople = listOf(
        Person(name = "Abhay",
        lastName = "Jha",
        age = 24),
        Person(name = "Kumar",
        lastName = "Jha",
        age = 23),
        Person(name = "Abha",
        lastName = "julia",
        age = 22),
        Person(name = "marasws",
        lastName = "Jhsdfaa",
        age = 43)
    )

    val sorteAge = listOfPeople.filter {
        it.age.equals(22)

    }

    listOfPeople.forEach{person ->
        println(person.age)
    }

    println(sorteAge)

}

data class Person(val name:String, val lastName:String, val age:Int)