package com.example.recycleviewend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewend.adapter.SuperHeroAdapter



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView() {
    val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)

    }

}