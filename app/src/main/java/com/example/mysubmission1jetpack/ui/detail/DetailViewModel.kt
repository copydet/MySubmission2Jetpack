package com.example.mysubmission1jetpack.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.data.source.local.entity.Entity


class DetailViewModel(private val filmRepository: FilmRepository): ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String){
        this.movieId = movieId
    }
    fun getMovie(): LiveData<Entity> = filmRepository.getDetailMovie(movieId)
    fun getTvshow(): LiveData<Entity> = filmRepository.getDetailTvshow(movieId)
}