package com.nicolas.sagon.gridpracticing.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val view: Int,
    @DrawableRes val picture: Int,
)
