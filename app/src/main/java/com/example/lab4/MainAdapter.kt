package com.example.lab4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val categories: List<CategoryData>,
                  private val onItemClick: (CategoryData) -> Unit): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return MainHolder(view)
    }

    override fun onBindViewHolder(
        holder: MainHolder,
        position: Int
    ) {
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class MainHolder(item: View) : RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.nameCatText)
        fun bind(category: CategoryData) {
            name.setText(category.titleRes)

            itemView.setOnClickListener {
                onItemClick(category)
            }
        }

    }
}
