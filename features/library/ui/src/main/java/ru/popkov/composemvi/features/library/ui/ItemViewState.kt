package ru.popkov.composemvi.features.library.ui

internal data class ItemViewState<Action>(
    val label: String,
    val description: String,
    val onClickAction: Action? = null,
)