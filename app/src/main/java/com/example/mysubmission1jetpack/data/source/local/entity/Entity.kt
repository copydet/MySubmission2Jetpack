package com.example.mysubmission1jetpack.data.source.local.entity

data class Entity(
        val movieId: String,
        val title: String,
        val release: String,
        val description: String,
        val tvshow: Boolean = false,
        val imagePath: String
)
