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
import com.example.mysubmission1jetpack.databinding.ActivityDetailTvshowBinding
import com.example.mysubmission1jetpack.databinding.ContentDetailFilmBinding
import com.example.mysubmission1jetpack.ui.viewmodel.ViewModelFactory

class DetailTvshowActivity : AppCompatActivity() {

    private lateinit var detailContentBinding : ContentDetailFilmBinding
    companion object{
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailFilmBinding = ActivityDetailTvshowBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailFilmBinding.detailContent
        setContentView(activityDetailFilmBinding.root)
        setSupportActionBar(activityDetailFilmBinding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        val viewModelTvshow = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val extrasTvshow = intent.extras
        if (extrasTvshow != null) {
            val tvshowId = extrasTvshow.getString(EXTRA_TVSHOW)
            if (tvshowId != null) {
                activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                viewModelTvshow.setSelectedMovie(tvshowId)
                viewModelTvshow.getTvshow().observe(this, { tvshow ->
                    activityDetailFilmBinding.progressBar.visibility = View.GONE
                    populateTvShow(tvshow)
                })
            }
        }
    }


    private fun populateTvShow(tvshow: Entity) {
        detailContentBinding.textTitle.text = tvshow.title
        detailContentBinding.textDescription.text = tvshow.description
        detailContentBinding.releaseDate.text = resources.getString(R.string.release_date, tvshow.release)

        Glide.with(this)
            .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2${tvshow.imagePath}")
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailContentBinding.imagePoster)

        }
    }

