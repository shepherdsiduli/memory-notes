package com.shepherd.memorynotes.framework.di

import com.shepherd.core.repository.NoteRepository
import com.shepherd.core.usecase.*
import com.shepherd.memorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}