package com.nsagon.learning.artspace

import androidx.annotation.DrawableRes

data class ArtPiece(
    @DrawableRes val picture: Int,
    val pictureTitle: String,
    val artistName: String,
    val date: String,
)
