package com.shepherd.core.usecase

import com.shepherd.core.data.Note
import com.shepherd.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}