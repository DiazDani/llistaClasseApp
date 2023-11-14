package com.sopa.llistaclasseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopa.llistaclasseapp.adapter.alumAdapter
import com.sopa.llistaclasseapp.databinding.ActivityMainBinding
import com.sopa.llistaclasseapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val recyclerView= binding.recycleAlumList
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=alumAdapter(alumProvider.alumList)
    }
}