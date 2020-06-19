package com.shepherd.memorynotes.framework

import com.shepherd.core.usecase.AddNote
import com.shepherd.core.usecase.GetAllNotes
import com.shepherd.core.usecase.GetNote
import com.shepherd.core.usecase.RemoveNote

data class UseCases (
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote
)