package com.example.mysubmission1jetpack.ui.academy

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mysubmission1jetpack.R
import com.example.mysubmission1jetpack.data.source.local.entity.Entity
import com.example.mysubmission1jetpack.databinding.ItemsMovieBinding
import com.example.mysubmission1jetpack.ui.detail.DetailFilmActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(private val binding: ItemsMovieBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Entity){
            with(binding){
                tvItemTitle.text = movie.title
                tvItemDate.text = itemView.resources.getString(R.string.release_date, movie.release)
                itemView.setOnClickListener {
                    val moveDetail = Intent(itemView.context, DetailFilmActivity::class.java)
                    moveDetail.putExtra(DetailFilmActivity.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(moveDetail)
                }
                Glide.with(itemView.context)
                        .load("https://www.themoviedb.org/t/p/w600_and_h900_bestv2${movie.imagePath}")
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }

    }
    private var listMovie = ArrayList<Entity>()

    fun setMovie(movie: List<Entity>?){
        if (movie.isNullOrEmpty()) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size
}
