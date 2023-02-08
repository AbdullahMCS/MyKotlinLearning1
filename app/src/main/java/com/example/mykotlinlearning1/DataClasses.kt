package com.example.mykotlinlearning1

data class DataClasses(
    val name: String,
    val age: Int,
    val job: List<AJob>
    ) {
    var income: Int = 0

    fun calcIncome() {
        job.forEach {
            income += it.salary
        }
    }
}

data class AJob(
    val companyName: String,
    val position: String,
    val salary: Int
    )

fun main() {
    val j1 = AJob("c1", "p1", 10000000)
    val j2 = AJob("c2", "p2", 20000000)
    val j3 = AJob("c3", "p3", 30000000)
    val x: DataClasses = DataClasses("A", 20, listOf(j1, j2, j3))

    x.calcIncome()
    println(x)
    println(x.income)
}