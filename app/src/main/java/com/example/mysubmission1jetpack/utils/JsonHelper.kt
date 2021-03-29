package com.example.mysubmission1jetpack.utils

import android.content.Context
import com.example.mysubmission1jetpack.R
import com.example.mysubmission1jetpack.data.source.remote.response.Response
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun pasringFileToString(fileName: String): String?{
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        }catch (ex: IOException){
            ex.printStackTrace()
            null
        }
    }
    fun loadMovie(): List<Response>{
        val list = ArrayList<Response>()
        try {
            val responseObject = JSONObject(pasringFileToString("MovieResponse.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()){
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("title")
                val description = movie.getString("overview")
                val realese = movie.getString("release_date")
                val boolean = false
                val poster = movie.getString("poster_path")

                val movieResponse = Response(id, title, description, realese,boolean, poster)
                list.add(movieResponse)
            }
        }catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShow(): List<Response>{
        val list = ArrayList<Response>()
        try {
            val responseObject = JSONObject(pasringFileToString("TvShowResponse.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()){
                val tvshow = listArray.getJSONObject(i)

                val id = tvshow.getString("id")
                val title = tvshow.getString("name")
                val description = tvshow.getString("overview")
                val realese = tvshow.getString("first_air_date")
                val boolean = false
                val poster = tvshow.getString("poster_path")

                val tvShowResponse = Response(id, title, description, realese, boolean, poster)
                list.add(tvShowResponse)
            }
        }catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }
}