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

class FragmentMoviesList : Fragment() {

    var listener: MoviesListItemClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is MoviesListItemClickListener) {
            listener = context
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?):
    View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onStart() {
        super.onStart()

        view?.findViewById<View>(R.id.movies_list_item_layout)?.setOnClickListener {
            listener?.onMovieSelected()
        }
    }

    override fun onDetach() {
        listener = null

        super.onDetach()
    }



    interface MoviesListItemClickListener {
        fun onMovieSelected()
    }

    companion object {
        fun create() = FragmentMoviesList()
    }
}