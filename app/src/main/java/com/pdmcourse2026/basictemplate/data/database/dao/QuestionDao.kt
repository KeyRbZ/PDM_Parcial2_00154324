package com.pdmcourse2026.basictemplate.data.database.dao

import androidx.room.*
import com.pdmcourse2026.basictemplate.data.database.entities.QuestionEntity
import com.pdmcourse2026.basictemplate.data.database.entities.QuestionWithOptions
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestionDao {

    @Transaction
    @Query("SELECT * FROM questions")
    fun getAllQuestionsWithOptions(): Flow<List<QuestionWithOptions>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestion(question: QuestionEntity): Long

    @Delete
    suspend fun deleteQuestion(question: QuestionEntity)
}