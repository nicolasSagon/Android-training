package com.nsagon.learning.composetutorial.kotlinFundamentals

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
) {
    private val isPopular: Boolean get() = playCount >= 1000

    private fun getIsPopularString(): String {
        return if (isPopular) {
            "popular"
        } else {
            "unpopular"
        }
    }

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished. This song is ${getIsPopularString()}")
    }
}

fun main() {
    Song("Title 1", "Artiste 1", 1999, 500).printDescription();
    Song("Title 2", "Artiste 1", 2005, 1000).printDescription();
}