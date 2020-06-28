package com.shepherd.memorynotes.framework.di

import android.app.Application
import com.shepherd.core.repository.NoteRepository
import com.shepherd.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}