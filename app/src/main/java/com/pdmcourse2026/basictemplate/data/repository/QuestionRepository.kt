package com.pdmcourse2026.basictemplate.data.repository

import com.pdmcourse2026.basictemplate.data.model.Question
import kotlinx.coroutines.flow.Flow

interface QuestionRepository {
    fun getQuestions(): Flow<List<Question>>
    suspend fun addQuestion(title: String): Long
    suspend fun deleteQuestion(question: Question)
}