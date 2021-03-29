package com.example.mysubmission1jetpack.data.source.remote

import android.os.Handler
import android.os.Looper
import com.example.mysubmission1jetpack.data.source.remote.response.Response
import com.example.mysubmission1jetpack.utils.EspressoIdlingResources
import com.example.mysubmission1jetpack.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper){

    private val handler = Handler(Looper.getMainLooper())

    companion object{
        private const val SERVICE_LATENCY_IN_MILLIS : Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this){
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllMovie(callback: LoadMovieCallback){
        EspressoIdlingResources.increment()
        handler.postDelayed({callback.onAllMovieReceived(jsonHelper.loadMovie())
                            EspressoIdlingResources.decrement()}, SERVICE_LATENCY_IN_MILLIS)
    }
    fun getAllTvshow(callback: LoadTvShowCallback){
        EspressoIdlingResources.increment()
        handler.postDelayed({callback.onAllTvShowReceived(jsonHelper.loadTvShow())
                            EspressoIdlingResources.decrement()}, SERVICE_LATENCY_IN_MILLIS)
    }

    interface LoadMovieCallback {
        fun onAllMovieReceived(movieResponse: List<Response>)
    }
    interface LoadTvShowCallback{
        fun onAllTvShowReceived(tvshowResponse: List<Response>)
    }
}