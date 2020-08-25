package com.example.spinneradapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecycleViewGrid: AppCompatActivity(){
    private var res: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview1)
        setupView()

    }

   private fun setupView() {
       res = findViewById(R.id.recycle1)
       val list1 = arrayListOf<String>()
       for (i in 1..10)
           list1.add("Строка$i")
       val adapter = AdapterSecond(list1)
       res?.layoutManager = GridLayoutManager(applicationContext, 3)
       res?.adapter = adapter
    }
}
