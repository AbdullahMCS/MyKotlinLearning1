package com.example.mykotlinlearning1.assignment0208

fun main() {
    print(validateCC("1111-2321-7625-1234", "12/34"))
}

fun validateCC(str1: String, str2: String): Boolean {
    val tmp1 = str1.takeLast(4)
    val tmp2 = str2.replace("/","")
    return tmp1 == tmp2
}