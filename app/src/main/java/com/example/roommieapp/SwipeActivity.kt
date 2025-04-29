package com.example.roommieapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roommieapp.databinding.ActivitySwipeBinding

class SwipeActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySwipeBinding
    private lateinit var adapter: SwipeCardAdapter
    private val roommates = mutableListOf<Roommate>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        fetchRoommatesFromFirestore()
    }

    private fun setupRecyclerView() {
        adapter = SwipeCardAdapter(roommates)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.itemAnimator = DefaultItemAnimator()

        val swipeCallback = SwipeCallback(adapter)
        val itemTouchHelper = ItemTouchHelper(swipeCallback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }

    private fun fetchRoommatesFromFirestore() {
        FirestoreService().fetchRoommates(
            onSuccess = {
                roommates.clear()
                roommates.addAll(it)
                adapter.notifyDataSetChanged()
            },
            onFailure = {
                Toast.makeText(this, "Failed to load roommates: ${it.message}", Toast.LENGTH_LONG).show()
            }
        )
    }
}
