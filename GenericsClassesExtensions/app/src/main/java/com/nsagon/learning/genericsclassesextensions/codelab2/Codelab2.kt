package com.nsagon.learning.genericsclassesextensions.codelab2

fun main() {
    val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    solarSystem[3] = "Little Earth"


    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    println(newSolarSystem[0])
    println(newSolarSystem[1])
    println(newSolarSystem[2])
    println(newSolarSystem[3])
    println(newSolarSystem[4])
    println(newSolarSystem[5])
    println(newSolarSystem[6])
    println(newSolarSystem[7])
    println(newSolarSystem[8])

}