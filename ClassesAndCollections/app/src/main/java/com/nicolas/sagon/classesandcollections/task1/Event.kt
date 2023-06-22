package com.nicolas.sagon.classesandcollections.task1

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: String,
    val duration: Int
)
