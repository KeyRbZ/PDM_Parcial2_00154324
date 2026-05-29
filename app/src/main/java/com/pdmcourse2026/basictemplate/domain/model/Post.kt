package com.pdmcourse2026.basictemplate.domain.model

import coil3.ColorImage

data class Post(
    val id: Int,
    val name: String,
    val image: ColorImage,
    val votes: String,
)