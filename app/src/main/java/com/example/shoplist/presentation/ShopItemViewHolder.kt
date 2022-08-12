package com.example.shoplist.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoplist.R

class ShopItemViewHolder(view: View): RecyclerView.ViewHolder(view){
    val tvName = view.findViewById<TextView>(R.id.tvName)
    val tvCount = view.findViewById<TextView>(R.id.tvCount)
}