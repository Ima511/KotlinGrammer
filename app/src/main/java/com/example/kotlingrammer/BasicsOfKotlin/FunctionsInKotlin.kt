package com.example.kotlingrammer.BasicsOfKotlin

fun main(){
//    calculate(1, 100, 3, "is multiple of")
//calculateCatAge(8)
//    val cacluateAgeInputValue = calculateCatAge(8)/7

   /* val catAge = calculateCatAge(catAge = 2)

    if (checkAge(catAge)){
        println("This cat is old ($catAge)")
    }else{
        println("This cat is young ($catAge)")
    }

    println(checkAge(catAge))*/

}

fun calculate(
    first:Int,
    second: Int,
    multipleOf:Int,
message: String){
//    println("This is a function")

    for (i in first..second){
        if (i%multipleOf == 0){
            println("$i $message $multipleOf")
        }
    }

}

fun  calculateCatAge(catAge: Int): Int {
//    println("This cat is ${catAge * 7}")
    return catAge * 7
}

fun checkAge(catAge: Int): Boolean{
    return catAge >= 14
}