package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
    val listOfNumber = listOf<Int>(23,34,45)
    val numberFinder = Finder(list = listOfNumber)
    val listOfItmes = listOf("Rafael", "Gina", "George", "James")
    val finder = Finder(list = listOfNumber)
    finder.findItem(element =23){
        println("Found $it")
    }

}

class Finder<T>(private val list: List<T>){
    fun findItem(element:T, foundItem: (element:T?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNullOrEmpty()){
            foundItem(null)
        }else{
            foundItem(itemFoundList.first())
        }
    }
}