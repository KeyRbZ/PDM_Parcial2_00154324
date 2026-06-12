package com.pdmcourse2026.basictemplate.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pdmcourse2026.basictemplate.data.model.Question

@Entity(tableName = "questions")
data class QuestionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String
)

fun QuestionEntity.toModel(options: List<com.pdmcourse2026.basictemplate.data.model.Option> = emptyList()): Question =
    Question(id = id, title = title, options = options)

fun Question.toEntity(): QuestionEntity =
    QuestionEntity(id = id, title = title)