package com.kshitij.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kshitij.viewpager.R

class ViewPagerRecycler(var list: Array<Int>) : RecyclerView.Adapter<ViewPagerRecycler.RecyclerViewHolder>() {

    class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}