package com.example.mykotlinlearning1.assignment0208

fun main() {
    val str = "some random string @test challenge @okay"
    println(str)
    println(replaceAnno1(str, "@test is Laptop", "@okay is Gone"))
    println(str)
}

fun replaceAnno1(str: String, vararg annotations: String): String {
    var tmp = str
    for (x in annotations) {
        val tmp1 = x.takeWhile { !it.isWhitespace() }
        val tmp2 = x.takeLastWhile { !it.isWhitespace() }
        tmp = tmp.replace(tmp1, tmp2)
    }
    return tmp
}