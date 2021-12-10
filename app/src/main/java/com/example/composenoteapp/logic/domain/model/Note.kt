package com.example.composenoteapp.logic.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.composenoteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val description: String,
    val createdAt: Long,
    val color: Int,
    @PrimaryKey val noteId: Int? = null
){
    companion object{
        val notesColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InValidNoteException(message: String): Exception(message)
