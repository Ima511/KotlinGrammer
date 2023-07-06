package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
        name("Abhay")
    enhancedMessage("Hello there,"){
        add(12, 12)
    }
}

fun showName(name: String){
    println(name)
}

val name:(String) -> Unit = {
    println("Hello My name is $it")
}

fun enhancedMessage(message:String, funAsParameter: () -> Int){
    println("$message ${funAsParameter()}")
}
