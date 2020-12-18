package com.talencote.movielist.movieslist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.data.MoviesDataSource
import com.talencote.movielist.R
import com.talencote.movielist.moviesdetails.FragmentMoviesDetails

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {

    private var recycler: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recycler = view.findViewById(R.id.rv_movies)
        recycler?.adapter = MovieListAdapter(clickListener)
        val layoutManager = GridLayoutManager(context, 2)
        recycler?.layoutManager = layoutManager
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        updateData()
    }

    private val clickListener = object : RouteToMovieDetails {
        override fun onMovieSelected() {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.persistent_container, FragmentMoviesDetails.newInstance(), FragmentMoviesDetails::class.java.simpleName)
                addToBackStack("trans: FragmentMoviesDetails")
                commit()
            }
        }
    }

    private fun updateData() {
        (recycler?.adapter as? MovieListAdapter)?.apply {
            bindMovies(MoviesDataSource().getMovies())
        }

    }

    companion object {
        fun newInstance() = FragmentMoviesList()
    }
}

interface RouteToMovieDetails {

    fun onMovieSelected()
}