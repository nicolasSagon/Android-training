package com.nicolas.sagon.classesandcollections.task7

import com.nicolas.sagon.classesandcollections.task2.Event

val Event.durationEvent: String
    get() = if (duration < 60) "short" else "long"
