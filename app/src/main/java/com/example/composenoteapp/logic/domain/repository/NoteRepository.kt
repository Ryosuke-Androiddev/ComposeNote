package com.example.composenoteapp.logic.domain.repository

import com.example.composenoteapp.logic.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAllNote(): Flow<List<Note>>

    suspend fun getNoteById(noteId: Int)

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}