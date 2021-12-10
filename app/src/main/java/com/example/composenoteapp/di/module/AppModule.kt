package com.example.composenoteapp.di.module

import android.app.Application
import androidx.room.Room
import com.example.composenoteapp.logic.data.data_source_model.NoteDataBase
import com.example.composenoteapp.logic.data.repository.NoteRepositoryImpl
import com.example.composenoteapp.logic.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDataBase {

        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            NoteDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideDaoToRepositoryImpl(dataBase: NoteDataBase): NoteRepository{
        return NoteRepositoryImpl(dataBase.noteDao)
    }

}