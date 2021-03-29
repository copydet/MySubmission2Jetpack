package com.example.mysubmission1jetpack.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mysubmission1jetpack.data.source.local.entity.Entity
import com.example.mysubmission1jetpack.data.source.remote.RemoteDataSource
import com.example.mysubmission1jetpack.data.source.remote.response.Response

class FilmRepository private constructor(private val remoteDataSource: RemoteDataSource): FilmDataSource{
    companion object{
        @Volatile
        private var instance: FilmRepository? = null

        fun getInstance(remoteData: RemoteDataSource): FilmRepository =
            instance ?: synchronized(this){
                instance ?: FilmRepository(remoteData)
            }
    }

    override fun getAllMovie(): LiveData<List<Entity>> {
        val movieResult = MutableLiveData<List<Entity>>()
        remoteDataSource.getAllMovie(object : RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponse: List<Response>) {
                val movieList = ArrayList<Entity>()
                for (respone in movieResponse){
                    val movie = Entity(respone.id,
                    respone.title,
                    respone.description,
                    respone.realese,
                    false,
                    respone.poster)
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }
        })

        return movieResult
    }

    override fun getAllTvShow(): LiveData<List<Entity>> {
        val tvshowResult = MutableLiveData<List<Entity>>()
        remoteDataSource.getAllTvshow(object : RemoteDataSource.LoadTvShowCallback{
            override fun onAllTvShowReceived(tvshowResponse: List<Response>) {
                val tvshowList = java.util.ArrayList<Entity>()
                for (respone in tvshowResponse){
                    val tvshow = Entity(respone.id,
                    respone.title,
                    respone.description,
                    respone.realese,
                    false,
                    respone.poster)
                    tvshowList.add(tvshow)
                }
                tvshowResult.postValue(tvshowList)
            }
        })
        return tvshowResult
    }

    override fun getDetailMovie(movieId: String): LiveData<Entity>{
        val movieResult = MutableLiveData<Entity>()
        remoteDataSource.getAllMovie(object : RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponse: List<Response>) {
                lateinit var movie : Entity
                for (response in movieResponse){
                    if (response.id == movieId){
                        movie = Entity(response.id,
                        response.title,
                        response.description,
                        response.realese,
                        false,
                        response.poster)
                    }
                }
                movieResult.postValue(movie)
            }
        })
        return movieResult
    }

    override fun getDetailTvshow(tvshowId: String): LiveData<Entity> {
        val tvShowResult = MutableLiveData<Entity>()
        remoteDataSource.getAllTvshow(object : RemoteDataSource.LoadTvShowCallback{
            override fun onAllTvShowReceived(tvshowResponse: List<Response>) {
                lateinit var tvshow : Entity
                for (response in tvshowResponse){
                    if (response.id == tvshowId){
                        tvshow = Entity(response.id,
                        response.title,
                        response.description,
                        response.realese,
                        false,
                        response.poster)
                    }
                }
                tvShowResult.postValue(tvshow)
            }
        })
        return tvShowResult
    }
}