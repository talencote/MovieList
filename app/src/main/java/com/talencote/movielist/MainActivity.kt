package com.talencote.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talencote.movielist.movieslist.FragmentMoviesList

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            routeToMoviesList()
        }
    }

    private fun routeToMoviesList() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.persistent_container, FragmentMoviesList.newInstance(), FragmentMoviesList::class.java.simpleName)
            commit()
        }
    }
}

