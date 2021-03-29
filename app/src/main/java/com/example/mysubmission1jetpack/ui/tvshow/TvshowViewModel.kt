package com.example.mysubmission1jetpack.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.data.source.local.entity.Entity


class TvshowViewModel(private val tvShowRepository: FilmRepository): ViewModel() {
    fun getTvshow(): LiveData<List<Entity>> = tvShowRepository.getAllTvShow()
}