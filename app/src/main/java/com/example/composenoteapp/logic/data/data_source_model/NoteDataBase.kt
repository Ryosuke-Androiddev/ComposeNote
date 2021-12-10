package com.example.composenoteapp.logic.data.data_source_model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.composenoteapp.logic.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDataBase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object{
        const val DATABASE_NAME = "note_db"
    }
}