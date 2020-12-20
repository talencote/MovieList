package com.talencote.movielist.moviesdetails

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.talencote.movielist.R
import com.talencote.movielist.data.Actor

class ActorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val actorImage: ImageView  = itemView.findViewById(R.id.cast_img)
    private val actorName: TextView = itemView.findViewById(R.id.cast_name)

    fun onBind(actor: Actor) {

        actorImage.setImageResource(actor.actorImage)
        actorName.text = actor.actorName
    }
}