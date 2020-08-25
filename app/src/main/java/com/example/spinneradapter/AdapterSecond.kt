package com.example.spinneradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleview.view.*
import kotlinx.android.synthetic.main.recycleview1.view.*

class AdapterSecond(private val array: ArrayList<String>) : RecyclerView.Adapter<Kholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Kholder {
        val gde = LayoutInflater.from(parent.context).inflate(R.layout.recycleview1, parent,false)
        return Kholder(gde)
    }

    override fun getItemCount(): Int = array.size


    override fun onBindViewHolder(holder: Kholder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}
class Kholder(gde: View) : RecyclerView.ViewHolder(gde) {
    fun bind(item: String) {
        itemView.text1.text = item
    }

}
