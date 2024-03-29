package ru.popkov.composemvi.features.library.data.remote.mappers

import ru.popkov.composemvi.features.library.data.local.entities.Song as SongEntity
import ru.popkov.composemvi.features.library.data.remote.dtos.Song as SongDto

object SongMapper {

    fun SongDto.toEntity(artistId: Long) =
        SongEntity(
            id = 0,
            title = title,
            artistId = artistId,
            duration = duration,
        )

}