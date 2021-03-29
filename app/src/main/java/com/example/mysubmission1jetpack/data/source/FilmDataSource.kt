package com.example.mysubmission1jetpack.data.source

import androidx.lifecycle.LiveData
import com.example.mysubmission1jetpack.data.source.local.entity.Entity

interface FilmDataSource {
    fun getAllMovie(): LiveData<List<Entity>>
    fun getAllTvShow(): LiveData<List<Entity>>
    fun getDetailMovie(movieId: String): LiveData<Entity>
    fun getDetailTvshow(tvshowId: String): LiveData<Entity>
}