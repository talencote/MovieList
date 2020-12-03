package com.talencote.movielist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  com.talencote.movielist.FragmentMoviesDetails
import  com.talencote.movielist.FragmentMoviesList
import android.widget.TextView

class MainActivity : AppCompatActivity(),
        FragmentMoviesList.MoviesListItemClickListener,
        FragmentMoviesDetails.MoviesDetailsBackClickListener
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            routeToMoviesList()
        }
    }

    override fun onMovieSelected() {
        routeToMovieDetails()
    }

    override fun onMovieDeselected() {
        routeBack()
    }

    private fun routeToMoviesList() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.persistent_container, FragmentMoviesList.create(), FragmentMoviesList::class.java.simpleName)
            addToBackStack("trans:${FragmentMoviesList::class.java.simpleName}")
            commit()
        }
    }

    private fun routeToMovieDetails() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.persistent_container, FragmentMoviesDetails.create(), FragmentMoviesDetails::class.java.simpleName)
            addToBackStack("trans:${FragmentMoviesDetails::class.java.simpleName}")
            commit()
        }
    }

    private fun routeBack() {
        supportFragmentManager.popBackStack()
    }
}

