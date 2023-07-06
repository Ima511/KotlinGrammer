package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
    println("Hello Jenny ".append(3))
    println("This is fun".removeFirsAndLastChars())


}

fun String.append(toAppend: Int):String = this.plus(toAppend)

fun String.removeFirsAndLastChars():String{
    return this.substring(1,this.length-1)
}
