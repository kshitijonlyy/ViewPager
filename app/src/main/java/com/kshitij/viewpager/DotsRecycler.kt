package com.kshitij.viewpager

import android.annotation.SuppressLint
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DotsRecycler(var currentItem: Int) : RecyclerView.Adapter<DotsRecycler.RecyclerViewHolder>() {

    class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgDot: ImageView = view.findViewById(R.id.imgDot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dots, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        if (position==currentItem){
//            highlight
        }
        else{
//            no change
        }
    }

    override fun getItemCount(): Int {
        return 4
    }

    fun updatePosition(position: Int) {
        currentItem = position
        notifyDataSetChanged()
    }
}