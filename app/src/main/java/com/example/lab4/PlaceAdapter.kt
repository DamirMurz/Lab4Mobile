package com.example.lab4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(private val onItemClick: (ElementData) -> Unit): RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {
    var placeList = listOf<ElementData>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlaceHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return PlaceHolder(view)
    }

    override fun onBindViewHolder(
        holder: PlaceHolder,
        position: Int
    ) {
        holder.bind(placeList[position])
    }

    fun setList(newList: List<ElementData>) {
        this.placeList = newList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
       return placeList.size
    }

    inner class PlaceHolder(item: View): RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.nameText)
        val desc = item.findViewById<TextView>(R.id.descText)
        val icon = item.findViewById<ImageView>(R.id.icon)
        fun bind(element: ElementData){
            name.setText(element.nameRes)
            desc.setText(element.shortDescRes)
            icon.setImageResource(element.icon)

            itemView.setOnClickListener {
                onItemClick(element)
            }
        }

    }

}