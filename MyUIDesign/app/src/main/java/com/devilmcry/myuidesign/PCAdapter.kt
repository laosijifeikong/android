package com.devilmcry.myuidesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PCAdapter(
    private val items: List<PCItem>,
    private val onItemClicked: (PCItem) -> Unit
): RecyclerView.Adapter<PCAdapter.PCViewHolder>() {

    class  PCViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
        val rank: TextView = itemView.findViewById(R.id.tvRank)
        val brand: TextView = itemView.findViewById(R.id.tvBrand)
        val score: TextView = itemView.findViewById(R.id.tvScore)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PCViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pc, parent, false)
        return PCViewHolder(view)
    }

    override fun onBindViewHolder(holder: PCViewHolder, position: Int) {
        val item = items[position]
        holder.rank.text = item.rank
        holder.brand.text = item.brand
        holder.score.text = item.score

        holder.itemView.setOnClickListener {
            onItemClicked(item)
        }
    }

    override fun getItemCount() = items.size
}