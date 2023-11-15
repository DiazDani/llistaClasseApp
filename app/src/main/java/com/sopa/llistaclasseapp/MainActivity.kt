package com.sopa.llistaclasseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sopa.llistaclasseapp.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val llistaAlum = arrayListOf<Alum>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Afegir.setOnClickListener(){
            val alNom =binding.etNom.text.toString()
            val alEdat= binding.editTextNumber.text.toString().toInt()


            llistaAlum.add(Alum(alNom,alEdat))

         //   Toast.makeText(this,"alumne ${llistaAlum[llistaAlum.size-1].nom} ", Toast.LENGTH_SHORT).show()

            binding.etNom.text.clear()
            binding.editTextNumber.text.clear()
        }

        binding.Enviar.setOnClickListener() {

            val intent = Intent(this, ResultActivity::class.java)
             intent.putParcelableArrayListExtra("llistaAlum",llistaAlum)

            startActivity(intent)
        }
    }


}