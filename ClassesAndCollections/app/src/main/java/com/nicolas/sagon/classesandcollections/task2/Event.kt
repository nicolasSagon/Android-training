package com.nicolas.sagon.classesandcollections.task2

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val duration: Int
)
