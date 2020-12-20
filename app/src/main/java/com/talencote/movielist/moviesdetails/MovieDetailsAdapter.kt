package com.talencote.movielist.moviesdetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.R
import com.talencote.movielist.data.Actor

class MovieDetailsAdapter : RecyclerView.Adapter<ActorViewHolder>() {

    private var actorsList: List<Actor> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_actor, parent, false)
        return ActorViewHolder(view)
    }

    override fun getItemCount(): Int {
        return actorsList.size
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.onBind(actorsList[position])
    }

    fun bindActors(newActors: List<Actor>) {
        actorsList = newActors
        notifyDataSetChanged()
    }
}