package com.nsagon.learning.composetutorial.kotlinFundamentals

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true, isScreenLightOn: Boolean = false) : Phone(isScreenLightOn = isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        }
    }

    fun toggleFoldable() {
        isFolded = !isFolded
    }
}

fun main() {
    val standardPhone = Phone()
    val foldablePhone = FoldablePhone()

    println("Standard Phone")
    println("Standard Phone - Switch screen on")
    standardPhone.switchOn()
    standardPhone.checkPhoneScreenLight()
    println("Standard Phone - Switch screen off")
    standardPhone.switchOff()
    standardPhone.checkPhoneScreenLight()

    println("Foldable Phone")
    println("Foldable Phone - Switch screen on")
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    println("Foldable Phone - open phone")
    foldablePhone.toggleFoldable()
    println("Foldable Phone - Switch screen on")
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    println("Foldable Phone - Switch screen off")
    foldablePhone.switchOff()
    foldablePhone.checkPhoneScreenLight()
}