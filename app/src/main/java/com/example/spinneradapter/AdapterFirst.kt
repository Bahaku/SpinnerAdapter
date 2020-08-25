package com.example.spinneradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleview.view.*

class AdapterFirst(private val array: ArrayList<String>) : RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val gou = LayoutInflater.from(parent.context).inflate(R.layout.recycleview, parent,false)
        return Holder(gou)
    }

    override fun getItemCount(): Int {
        return array.size

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}
class Holder(gou: View) : RecyclerView.ViewHolder(gou) {
    fun bind(item: String) {
        itemView.text.text = item
    }

}