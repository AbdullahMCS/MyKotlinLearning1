package com.example.mykotlinlearning1

enum class E1(val w: String, val i: Int) {
    x("this is x", 1),
    y("this is y", 2),
    z("this is z", 3)
}

enum class E2{
    a {
        override fun propName(): String {
            return "This is a"
        }

    };

    abstract fun propName(): String
}

sealed class S1{
    class a : S1() {
        fun printSomething() { println("Something")}
    }
    class b : S1() {
        fun printSomethingElse() { println("Something Else")}
    }
}

class SealedClassTest2: S1() {
    fun doSomething(): Boolean = true
}

class sealedClassTest(val x: S1){
    fun testing() {
        when(x) {
            is S1.a -> { x.printSomething() }
            is S1.b -> { x.printSomethingElse() }
            is SealedClassTest2 -> { println( x.doSomething()) }
        }
    }
}

fun main() {
    val t1 = E1.x.i
    println(t1)

    val t2 = E2.a
    println(t2.propName())

    val t3 = S1.a()
    sealedClassTest(t3).testing()
}