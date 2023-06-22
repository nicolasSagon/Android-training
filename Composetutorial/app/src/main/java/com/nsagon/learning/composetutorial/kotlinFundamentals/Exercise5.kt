package com.nsagon.learning.composetutorial.kotlinFundamentals

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(private val name: String, private val age: Int, private val hobby: String?, private val referrer: Person?) {

    private fun getHobbyString(): String {
        return if (hobby != null) {
            "Likes to $hobby"
        } else {
            ""
        }
    }

    private fun getReferrerString(): String {
        return if (referrer == null){
            "Doesn't have a referrer"
        } else {
            "Has a referrer named ${referrer.name}, who ${referrer.getHobbyString()}"
        }
    }

    fun showProfile() {
        println("Name : $name")
        println("Age: $age")
        println("${getHobbyString()}. ${getReferrerString()}")
    }
}