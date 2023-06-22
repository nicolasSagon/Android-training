package com.nsagon.learning.lemonade

class LemonadeState(var currentState: Int = 0) {

    companion object {
        fun increaseStep(currentStep: Int): LemonadeState {
            if (currentStep >= 3) {
                return LemonadeState(0)
            }
            return LemonadeState(currentStep + 1)
        }
    }

    fun getLemonadeStep(): LemonadeStep {
        return when (currentState) {
            0 -> LemonadeStep.LemonadeStep1()
            1 -> LemonadeStep.LemonadeStep2()
            2 -> LemonadeStep.LemonadeStep3()
            else -> {
                LemonadeStep.LemonadeStep4()
            }
        }
    }
}