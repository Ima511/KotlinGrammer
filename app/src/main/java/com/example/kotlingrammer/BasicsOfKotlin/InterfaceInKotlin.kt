package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
    val button = Button(label = "Button")
    button.onClick("This is a click on the Button")

    val superMario = Character(name = "Super Mario")
    superMario.onClick(message = "This is an actor!")

}

// Character class
class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message $message")
    }

}

// Button Class
class Button(val label:String): ClickEvent {
    override fun onClick(message: String) {
            println("Clicked by $label and here is message $message")
    }

}


// Interfaces
interface ClickEvent{
    fun onClick(message:String)
}