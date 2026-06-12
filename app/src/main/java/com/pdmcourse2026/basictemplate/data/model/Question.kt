package com.pdmcourse2026.basictemplate.data.model

data class Question(
    val id: Int = 0,
    val title: String,
    val options: List<Option> = emptyList()
)