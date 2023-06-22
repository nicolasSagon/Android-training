package com.nicolas.sagon.classesandcollections.task4

import com.nicolas.sagon.classesandcollections.task2.DayPart
import com.nicolas.sagon.classesandcollections.task2.Event

fun main() {

    val eventList = mutableListOf(
        Event(
            title = "Wake up",
            description = "Time to get up",
            dayPart = DayPart.MORNING,
            duration = 0
        ),
        Event(title = "Eat breakfast", dayPart = DayPart.MORNING, duration = 15),
        Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, duration = 30),
        Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, duration = 60),
        Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, duration = 10),
        Event(
            title = "Check out latest Android Jetpack library",
            dayPart = DayPart.EVENING,
            duration = 45
        )
    )

    val shortEvents = eventList.filter { it.duration < 60 }
    println("You have ${shortEvents.size} shorts event")
}