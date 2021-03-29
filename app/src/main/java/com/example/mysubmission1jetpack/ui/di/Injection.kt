package com.example.mysubmission1jetpack.ui.di

import android.content.Context
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.data.source.remote.RemoteDataSource
import com.example.mysubmission1jetpack.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): FilmRepository{
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return FilmRepository.getInstance(remoteDataSource)
    }
}