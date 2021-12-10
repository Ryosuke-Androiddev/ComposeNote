package com.example.composenoteapp.logic.data.repository

import com.example.composenoteapp.logic.data.data_source_model.NoteDao
import com.example.composenoteapp.logic.data.data_source_model.NoteDataBase
import com.example.composenoteapp.logic.domain.model.Note
import com.example.composenoteapp.logic.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository {

    override fun getAllNote(): Flow<List<Note>> {
        return noteDao.getAllNote()
    }

    override suspend fun getNoteById(noteId: Int) {
        noteDao.getNoteById(noteId)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

}