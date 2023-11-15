package com.sopa.llistaclasseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopa.llistaclasseapp.adapter.alumAdapter
import com.sopa.llistaclasseapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
       initRecyclerView()
    }
    private fun initRecyclerView(){
        var AlumLlistat = intent.getParcelableArrayListExtra<Alum>("llistaAlum") as List<Alum>
       // val recyclerView= binding.recycleAlumList
        binding.recycleAlumList.layoutManager= LinearLayoutManager(this)
        binding.recycleAlumList.adapter=alumAdapter(AlumLlistat)
    }
}