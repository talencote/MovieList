package com.talencote.movielist.data

import com.talencote.movielist.R

class MoviesDataSource {
    fun getMovies(): List<Movie> {
        return listOf(
                Movie(R.drawable.movie_prev_avengers, "Avengers: End Game", "Action, Adventure, Drama", "137 MINS", "125 REVIEWS", "13+", false),
                Movie(R.drawable.movie_prev_tenet, "Tenet", "Action, Sci-Fi, Triller", "97 MINS", "98 REVIEWS", "16+", true),
                Movie(R.drawable.movie_prev_black_window, "Black Widow", "Action, Adventure, Sci-Fi", "137 MINS", "125 REVIEWS", "13+", false),
                Movie(R.drawable.movie_prev_wonder_woman, "Wonder Woman 1987", "Action, Adventure, Fantasy", "120 MINS", "74 REVIEWS", "13+", false)
        )
    }
}