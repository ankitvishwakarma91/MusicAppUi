package com.ankit.mymusicapp

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon :Int, val name : String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_queue_music_24,"PlayList"),
    Lib(R.drawable.baseline_mic_none_24,"Artist"),
    Lib(R.drawable.baseline_album_24,"Album"),
    Lib(R.drawable.baseline_music_note_24,"Music"),
    Lib(R.drawable.baseline_playlist_add_24,"Genre")
)
