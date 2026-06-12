package com.pdmcourse2026.basictemplate.data.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.pdmcourse2026.basictemplate.data.model.Option

@Entity(
    tableName = "options",
    foreignKeys = [
        ForeignKey(
            entity = QuestionEntity::class,
            parentColumns = ["id"],
            childColumns = ["questionId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("questionId")]
)
data class OptionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val questionId: Int,
    val name: String,
    val imageUrl: String
)

fun OptionEntity.toModel(): Option =
    Option(id = id, questionId = questionId, name = name, imageUrl = imageUrl)

fun Option.toEntity(): OptionEntity =
    OptionEntity(id = id, questionId = questionId, name = name, imageUrl = imageUrl)