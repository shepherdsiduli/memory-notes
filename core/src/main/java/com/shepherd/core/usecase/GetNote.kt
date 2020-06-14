package com.shepherd.core.usecase

import com.shepherd.core.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(id : Long) = noteRepository.getNote(id)
}