package com.kshitij.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class DotsRecycler(var context: Context, var totalCount: Int) :
    RecyclerView.Adapter<DotsRecycler.RecyclerViewHolder>() {
    var currentItem = 0

    class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgDot: ImageView = view.findViewById(R.id.imgDot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dots, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        if (position == currentItem) {
            holder.imgDot.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.dot_purple
                )
            )
        } else {
            holder.imgDot.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.dot))
        }
    }

    override fun getItemCount(): Int {
        return totalCount
    }

    fun updatePosition(position: Int) {
        currentItem = position
        notifyDataSetChanged()
    }
}