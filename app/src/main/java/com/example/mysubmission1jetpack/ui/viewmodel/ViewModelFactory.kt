package com.example.mysubmission1jetpack.ui.viewmodel

import android.content.Context
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.ui.academy.MovieViewModel
import com.example.mysubmission1jetpack.ui.detail.DetailViewModel
import com.example.mysubmission1jetpack.ui.di.Injection
import com.example.mysubmission1jetpack.ui.tvshow.TvshowViewModel

class ViewModelFactory private constructor(private val mFilmRepository: FilmRepository): ViewModelProvider.NewInstanceFactory(){

    companion object{
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
                instance ?: synchronized(this){
                    instance ?: ViewModelFactory(Injection.provideRepository(context))
                }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T: ViewModel>create(modelClass: Class<T>):T{
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java)->{
                return MovieViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(TvshowViewModel::class.java)->{
                return TvshowViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java)->{
                return DetailViewModel(mFilmRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}