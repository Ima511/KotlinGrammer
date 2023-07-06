package com.example.kotlingrammer.BasicsOfKotlin

fun main(){

  val car = Car(color = "Green", model = "LLM")
  car.color = "Black"
  car.model = "QLM"
    car.speed(minSpeed = 50, maxSpeed = 190)

    // Truck
    val truck = Truck(
        color ="Magenta",
        model = "F16")
    truck.drive()
    truck.speed(12,60)

}

open class Car(var color: String, var model: String){
    init {
        if (color == "Green"){
            println("Yey color is Green")
        }else{
            println("$color is not green")
        }
    }

   open fun speed(minSpeed: Int, maxSpeed: Int){
        println("Min speed is $minSpeed and Max speed is $maxSpeed")
    }

   open fun drive(){
        println("Drive...vrooom")
    }
}

class Truck(color: String, model: String): Car(color, model){

    override fun speed(minSpeed: Int, maxSpeed: Int) {
        super.speed(minSpeed, maxSpeed)
    }

    override fun drive() {
        println("Vroomm... Like a truck")
    }
}