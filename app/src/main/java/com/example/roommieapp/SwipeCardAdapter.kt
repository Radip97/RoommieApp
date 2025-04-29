package com.example.roommieapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.roommieapp.databinding.ItemRoommateCardBinding

<<<<<<< HEAD
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
=======
class SwipeCardAdapter(private val roommates: MutableList<Roommate>) : 
    RecyclerView.Adapter<SwipeCardAdapter.CardViewHolder>() {

    class CardViewHolder(private val binding: ItemRoommateCardBinding) : 
        RecyclerView.ViewHolder(binding.root) {
        
        fun bind(roommate: Roommate) {
            binding.tvName.text = "${roommate.name}, ${roommate.age}"
            binding.tvBio.text = roommate.bio
            Glide.with(binding.root.context)
                .load(roommate.imageUrl)
                .into(binding.ivProfile)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ItemRoommateCardBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(roommates[position])
    }

    override fun getItemCount() = roommates.size

    fun removeAt(position: Int) {
        roommates.removeAt(position)
>>>>>>> b0db30e (login)
        notifyItemRemoved(position)
    }
}
