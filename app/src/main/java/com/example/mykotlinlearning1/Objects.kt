package com.example.mykotlinlearning1

class NumberOne(val x: String) {
    fun theFunction() {
        println("This is THE FUNCTION $x")
    }

    companion object {
        var obj: NumberOne? = null
        fun createObj(s: String): NumberOne {
            return obj ?: synchronized(this) {
                val instance = NumberOne(s)
                obj = instance
                instance
            }
        }
    }
}

fun main() {
    val x = NumberOne.createObj("obj1")
    val y = NumberOne.createObj("obj2")

    x.theFunction()
    y.theFunction()
}