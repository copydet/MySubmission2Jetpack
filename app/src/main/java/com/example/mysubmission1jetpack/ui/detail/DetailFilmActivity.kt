package com.example.mysubmission1jetpack.ui.detail


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.mysubmission1jetpack.R
import com.example.mysubmission1jetpack.data.source.local.entity.Entity
import com.example.mysubmission1jetpack.databinding.ActivityDetailFilmBinding
import com.example.mysubmission1jetpack.databinding.ContentDetailFilmBinding
import com.example.mysubmission1jetpack.ui.viewmodel.ViewModelFactory

class DetailFilmActivity : AppCompatActivity() {

    private lateinit var detailContentBinding : ContentDetailFilmBinding

    companion object{
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailFilmBinding = ActivityDetailFilmBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailFilmBinding.detailContent
        setContentView(activityDetailFilmBinding.root)
        setSupportActionBar(activityDetailFilmBinding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        val viewModelMovie = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val extrasMovie = intent.extras
        if (extrasMovie != null) {

            val movieId = extrasMovie.getString(EXTRA_MOVIE)
            if (movieId != null) {
                activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                viewModelMovie.setSelectedMovie(movieId)
                viewModelMovie.getMovie().observe(this, {movie ->
                    activityDetailFilmBinding.progressBar.visibility = View.GONE
                    populateMovie(movie)
                })
            }
        }
    }

    private fun populateMovie(movie: Entity) {
        detailContentBinding.textTitle.text = movie.title
        detailContentBinding.textDescription.text = movie.description
        detailContentBinding.releaseDate.text = resources.getString(R.string.release_date, movie.release)

        Glide.with(this)
                .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2${movie.imagePath}")
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailContentBinding.imagePoster)


    }

}
