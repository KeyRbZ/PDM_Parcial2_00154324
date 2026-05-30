package com.pdmcourse2026.basictemplate.domain.model

data class Post(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val votes: Int = 0,
)