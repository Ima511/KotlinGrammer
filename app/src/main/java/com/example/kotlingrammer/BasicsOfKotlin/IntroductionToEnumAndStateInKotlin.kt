package com.example.kotlingrammer.BasicsOfKotlin
/*

fun main(){

    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())

}

fun getResult(result: Result){
    return when(result){
        Result.SUCCESS -> println("Success!")
        Result.FAILURE -> println("Failure!")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle!")
        Result.LOADING -> println("Loading!...")
    }
}

object Repository{
    private var loadstate: Result = Result.IDLE
    private var dataFetched: String? = null
    fun startFetch(){
        loadstate = Result.LOADING
        dataFetched = "data"
    }

    fun finishedFetch(){
        loadstate = Result.SUCCESS
        dataFetched = null
    }

    fun error(){
        loadstate = Result.ERROR
        dataFetched = null
    }

    fun getCurrentState(): Result {
        return loadstate
    }
}

enum class Result{
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}*/
