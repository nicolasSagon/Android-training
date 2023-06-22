package com.nicolas.sagon.classesandcollections.task2

fun main() {
    val event = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        DayPart.EVENING,
        15
    )

    println(event)
}