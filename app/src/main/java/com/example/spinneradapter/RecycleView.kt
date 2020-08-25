package com.example.spinneradapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecycleView: AppCompatActivity() {
    private var recycle: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitiviry_recycle)
        setupView()
    }

    private fun setupView(){
        recycle = findViewById(R.id.recycle1)
        val list = arrayListOf<String>()
        for (i in 1..10)
        list.add("Строка$i")
        val adapter = AdapterFirst(list)
        recycle?.adapter = adapter
    }


}