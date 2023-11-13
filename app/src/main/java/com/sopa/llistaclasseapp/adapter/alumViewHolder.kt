package com.sopa.llistaclasseapp.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sopa.llistaclasseapp.Alum
import com.sopa.llistaclasseapp.databinding.ItemAlumBinding

class alumViewHolder (view: View): RecyclerView.ViewHolder(view){
    lateinit var binding: ItemAlumBinding
    val name = binding.tvNom
    val age = binding.tvEdat
    fun render(alumModel: Alum){
        name.text=alumModel.nom
        age.text=alumModel.edat
    }
}