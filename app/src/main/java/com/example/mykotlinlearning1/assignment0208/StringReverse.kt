package com.example.mykotlinlearning1.assignment0208

fun main() {
    val str = "xyz abc def rtyqwe"
    println("Test 1:")
    println(str)
    println(reverseString1(str))
    println(str)

    println("\nTest 2:")
    println(str)
    println(reverseString2(str))
    println(str)
}

fun reverseString1(str: String): String {
    return str.reversed()
}

fun reverseString2(str: String): String {
    var s = ""
    for (x in str.indices)
        s += str[str.length - 1 - x]
    return s
}