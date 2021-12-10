package com.example.composenoteapp.logic.data.data_source_model

import androidx.room.*
import com.example.composenoteapp.logic.domain.model.Note
import com.google.android.material.circularreveal.CircularRevealHelper
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    //Dao で，SQL操作を行う

    @Query("SELECT * FROM note")
    fun getAllNote(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE noteId = :noteId")
    suspend fun getNoteById(noteId: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}