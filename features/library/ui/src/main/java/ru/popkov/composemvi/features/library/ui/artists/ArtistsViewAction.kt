package ru.popkov.composemvi.features.library.ui.artists

internal sealed interface ArtistsViewAction {

    data class ArtistClick(val artistId: Long) : ArtistsViewAction

    data object RefreshClick : ArtistsViewAction

}