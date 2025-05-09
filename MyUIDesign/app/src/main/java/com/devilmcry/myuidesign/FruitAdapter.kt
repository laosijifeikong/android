package com.devilmcry.myuidesign

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.devilmcry.myuidesign.databinding.FruitItemBinding

class FruitAdapter(private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: FruitItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FruitItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = ViewHolder(binding)

        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.bindingAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val fruit = fruitList[position]
                Toast.makeText(parent.context, "你点击了 ${fruit.name}", Toast.LENGTH_SHORT).show()
            }
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.binding.fruitImage.setImageResource(fruit.imageId)
        holder.binding.fruitName.text = fruit.name
    }

    override fun getItemCount() = fruitList.size
}
