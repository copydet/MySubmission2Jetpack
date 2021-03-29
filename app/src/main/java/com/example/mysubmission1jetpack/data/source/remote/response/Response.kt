package com.example.mysubmission1jetpack.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Response (
    val id : String,
    val title: String,
    val realese: String,
    val description: String,
    val tvshow : Boolean,
    val poster: String
    ): Parcelable