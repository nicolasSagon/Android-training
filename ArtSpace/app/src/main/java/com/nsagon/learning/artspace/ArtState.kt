package com.nsagon.learning.artspace

data class ArtState(val currentItem: Int) {
    companion object {
        private val listOfArtPiece = listOf(
            ArtPiece(
                R.drawable.glows_berry_1,
                artistName = "Marion Nouar @glowsberry",
                pictureTitle = "Femme fleur",
                date = "2023"
            ),
            ArtPiece(
                R.drawable.glows_berry_2,
                artistName = "Marion Nouar @glowsberry",
                pictureTitle = "Visage de louve",
                date = "2023"
            )
        )

        fun getInitialArtState(): ArtState {
            return ArtState((0 until listOfArtPiece.count()).random())
        }
    }

    fun previousPiece(): ArtState {
        val newIndex = if (currentItem <= 0) listOfArtPiece.count() - 1 else currentItem - 1

        return ArtState(newIndex)
    }

    fun nextPiece(): ArtState {
        val newIndex = if (currentItem >= listOfArtPiece.count() - 1) 0 else currentItem + 1

        return ArtState(newIndex)
    }

    fun getCurrentArtPiece(): ArtPiece {
        return listOfArtPiece[currentItem]
    }
}
