package com.talencote.movielist.movieslist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.R
import com.talencote.movielist.data.Movie

class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val movieImage: ImageView = itemView.findViewById(R.id.movies_list_header_image)
    private val movieName: TextView = itemView.findViewById(R.id.movie_name)
    private val movieTags: TextView = itemView.findViewById(R.id.movie_tags)
    private val movieLength: TextView = itemView.findViewById(R.id.movie_length)
    private val movieReviews: TextView = itemView.findViewById(R.id.movie_reviews)
    private val movieAge: TextView = itemView.findViewById(R.id.movies_age)
    private val movieFavorite: ImageView = itemView.findViewById(R.id.movies_favorite)

    fun onBind(movie: Movie) {
        movieImage.setImageResource(movie.movieImage)
        movieName.text = movie.movieName
        movieTags.text = movie.movieTags
        movieLength.text = movie.movieLength
        movieReviews.text = movie.movieReviews
        movieAge.text = movie.movieAge
        if (movie.isFavorite) {
            movieFavorite.setColorFilter(R.color.pink_light)
        }
    }
}