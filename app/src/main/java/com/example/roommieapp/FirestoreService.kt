package com.example.roommieapp

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject

class FirestoreService {
    private val db = FirebaseFirestore.getInstance()
    private val roommatesRef = db.collection("roommates")

    fun fetchRoommates(
        onSuccess: (List<Roommate>) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        roommatesRef.get()
            .addOnSuccessListener { result ->
                val roommateList = result.documents.mapNotNull { doc ->
                    doc.toObject<Roommate>()
                }
                onSuccess(roommateList)
            }
            .addOnFailureListener { exception ->
                onFailure(exception)
            }
    }
}
