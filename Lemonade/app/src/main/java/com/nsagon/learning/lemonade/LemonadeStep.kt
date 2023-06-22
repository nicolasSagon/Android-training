package com.nsagon.learning.lemonade

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

open class LemonadeStep(
    @DrawableRes open val drawableRes: Int,
    @StringRes open val contentDescription: Int,
    @StringRes open val text: Int
) {
    data class LemonadeStep1(
        @DrawableRes override val drawableRes: Int = R.drawable.lemon_tree,
        @StringRes override val contentDescription: Int = R.string.first_step_lemonade_content_description,
        @StringRes override val text: Int = R.string.first_step_lemonade
    ) :
        LemonadeStep(
            drawableRes,
            contentDescription,
            text
        )

    data class LemonadeStep2(
        @DrawableRes override val drawableRes: Int = R.drawable.lemon_squeeze,
        @StringRes override val contentDescription: Int = R.string.second_step_lemonade_content_description,
        @StringRes override val text: Int = R.string.second_step_lemonade
    ) :
        LemonadeStep(
            drawableRes,
            contentDescription,
            text
        )

    data class LemonadeStep3(
        @DrawableRes override val drawableRes: Int = R.drawable.lemon_drink,
        @StringRes override val contentDescription: Int = R.string.third_step_lemonade_content_description,
        @StringRes override val text: Int = R.string.third_step_lemonade
    ) :
        LemonadeStep(
            drawableRes,
            contentDescription,
            text
        )

    data class LemonadeStep4(
        @DrawableRes override val drawableRes: Int = R.drawable.lemon_restart,
        @StringRes override val contentDescription: Int = R.string.fourth_step_lemonade_content_description,
        @StringRes override val text: Int = R.string.fourth_step_lemonade
    ) :
        LemonadeStep(
            drawableRes,
            contentDescription,
            text
        )
}
