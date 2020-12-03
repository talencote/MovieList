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

class FragmentMoviesDetails : Fragment() {

    var listener: MoviesDetailsBackClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MoviesDetailsBackClickListener) {
            listener = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

    override fun onStart() {
        super.onStart()

        view?.findViewById<TextView>(R.id.back_btn)?.setOnClickListener {
            listener?.onMovieDeselected()
        }
    }

    override fun onDetach() {
        super.onDetach()

        listener = null
    }

    interface MoviesDetailsBackClickListener {
        fun onMovieDeselected()
    }

    companion object {
        fun create() = FragmentMoviesDetails()
    }
}