package com.talencote.movielist.movieslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.R
import com.talencote.movielist.data.Movie


class MovieListAdapter(
    private val clickListener: RouteToMovieDetails
) : RecyclerView.Adapter<MovieViewHolder>() {

    private var moviesList: List<Movie> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.onBind(moviesList[position])
        holder.itemView.setOnClickListener {
            clickListener.onMovieSelected()
        }
    }

    fun bindMovies(newMovies: List<Movie>) {
        moviesList = newMovies
        notifyDataSetChanged()
    }

}

