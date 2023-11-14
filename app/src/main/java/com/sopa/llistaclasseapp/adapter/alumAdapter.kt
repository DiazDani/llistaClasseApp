package com.sopa.llistaclasseapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopa.llistaclasseapp.Alum
import com.sopa.llistaclasseapp.R

class alumAdapter(val alumList:List<Alum>) : RecyclerView.Adapter<alumViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): alumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return alumViewHolder(layoutInflater.inflate(R.layout.item_alum, parent, false))
    }

    override fun onBindViewHolder(holder: alumViewHolder, position: Int) {
        val item = alumList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = alumList.size
}