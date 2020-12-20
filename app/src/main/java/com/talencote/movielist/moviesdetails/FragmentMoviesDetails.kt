package com.talencote.movielist.moviesdetails

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.R
import com.talencote.movielist.data.ActorDataSource

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {

    private var recycler: RecyclerView? = null
    private var backBTN: TextView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        findViews()
        fillViews()
        setListeners()

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        updateData()
    }

    private fun findViews() {
        recycler = view?.findViewById(R.id.rv_cast)
        backBTN = view?.findViewById<TextView>(R.id.back_btn)
    }

    private fun fillViews() {
        recycler?.adapter = MovieDetailsAdapter()
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recycler?.layoutManager = layoutManager
    }

    private fun setListeners() {
        backBTN?.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    private fun updateData() {
        (recycler?.adapter as? MovieDetailsAdapter)?.apply {
            bindActors(ActorDataSource().getActors())
        }
    }

    companion object {
        fun newInstance() = FragmentMoviesDetails()
    }
}