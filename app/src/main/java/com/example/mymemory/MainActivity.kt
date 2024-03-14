package com.example.mymemory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBoard  : RecyclerView
    private lateinit var tvNumMoves:TextView  
    private lateinit var tvNumPairs:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBoard = findViewById(R.id.rv)
        tvNumMoves = findViewById(R.id.moves_text)
        tvNumPairs = findViewById(R.id.pais_text)

        rvBoard.adapter = MemoryBoardAdapter(this,8)
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this,2)
    }


}


