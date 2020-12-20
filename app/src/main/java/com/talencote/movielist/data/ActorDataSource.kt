package com.talencote.movielist.data

import com.talencote.movielist.R

class ActorDataSource {
    fun getActors(): List<Actor> {
        return listOf(
                Actor(R.drawable.cast_img_robert_downey_jr, "Robert Downey Jr."),
                Actor(R.drawable.cast_img_chris_evans, "Chris Evans"),
                Actor(R.drawable.cast_img_mark_ruffalo, "Mark Ruffalo"),
                Actor(R.drawable.cast_img_chris_hemsworth, "Chris Hemsworth")
        )
    }
}