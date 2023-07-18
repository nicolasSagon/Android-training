package com.nicolas.sagon.coroutinePlayGround

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport4())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport4() = coroutineScope {
    val forecast = async { getForecast4() }
    val temperature = async { getTemperature4() }
    delay(200)
    temperature.cancel()
    forecast.await()
}

suspend fun getForecast4(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature4(): String {
    delay(1000)
    return "40\u00b0C"
}