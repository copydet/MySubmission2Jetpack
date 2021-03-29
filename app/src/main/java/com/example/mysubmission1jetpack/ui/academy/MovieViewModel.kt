package com.example.mysubmission1jetpack.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.data.source.local.entity.Entity


class MovieViewModel(private val movieRepository: FilmRepository): ViewModel() {
    fun getMovie(): LiveData<List<Entity>> = movieRepository.getAllMovie()
}