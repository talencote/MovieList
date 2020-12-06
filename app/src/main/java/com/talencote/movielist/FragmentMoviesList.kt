package com.talencote.movielist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    override fun onStart() {
        super.onStart()

        view?.findViewById<View>(R.id.movies_list_item_layout)?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.persistent_container, FragmentMoviesDetails.newInstance(), FragmentMoviesDetails::class.java.simpleName)
                addToBackStack("trans: FragmentMoviesDetails")
                commit()
            }
        }
    }

    companion object {
        fun newInstance() = FragmentMoviesList()
    }
}