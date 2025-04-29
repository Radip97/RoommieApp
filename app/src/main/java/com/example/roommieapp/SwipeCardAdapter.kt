package com.example.roommieapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.roommieapp.databinding.ItemRoommateCardBinding

class SwipeCardAdapter(private val list: MutableList<Roommate>) : RecyclerView.Adapter<SwipeCardAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemRoommateCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRoommateCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val roommate = list[position]
        holder.binding.tvNameAge.text = "${roommate.name}, ${roommate.age}"
        holder.binding.tvBio.text = roommate.bio
        Glide.with(holder.itemView.context).load(roommate.imageUrl).into(holder.binding.ivProfile)
    }

    override fun getItemCount(): Int = list.size

    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }
}
