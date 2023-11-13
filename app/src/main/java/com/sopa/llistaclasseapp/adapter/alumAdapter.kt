package com.sopa.llistaclasseapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopa.llistaclasseapp.Alum

class alumAdapter(val alumList:List<Alum>) : RecyclerView.Adapter<alumViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): alumViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: alumViewHolder, position: Int) {
        val item = alumList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = alumList.size
}