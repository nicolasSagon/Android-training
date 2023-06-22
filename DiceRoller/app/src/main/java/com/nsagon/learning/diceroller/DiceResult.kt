package com.nsagon.learning.diceroller

import android.content.Context
import androidx.annotation.DrawableRes

class DiceResult(private val value: Int) {
    companion object {
        fun getRandomDiceValue(): DiceResult {
            val randomValue = (1..6).random()
            return DiceResult(randomValue)
        }
    }

    @DrawableRes
    fun getDrawableResId(): Int {
        return when (value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {
                R.drawable.dice_6
            }
        }
    }

    fun getContentDescription(context: Context): String {
        return buildString {
            append(context.getString(R.string.dice_result))
            append(value)
        }
    }
}