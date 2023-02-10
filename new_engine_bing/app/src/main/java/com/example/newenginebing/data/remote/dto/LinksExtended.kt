package com.example.newenginebing.data.remote.dto


import com.example.newenginebing.data.remote.dto.Stats

data class LinksExtended(
    val stats: Stats,
    val type: String,
    val url: String
)