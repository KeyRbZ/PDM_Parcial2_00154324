package com.pdmcourse2026.basictemplate.data.api.dto

import coil3.ColorImage
import coil3.Image
import com.pdmcourse2026.basictemplate.domain.model.Post
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PostDto(
    @SerialName("id")
    val id: Int = 0,

    @SerialName("name")
    val name: String = "",

    @SerialName("image")
    val image: Image = ColorImage,

    @SerialName("votes")
    val votes: String = "",
    )

fun PostDto.toModel(): Post = Post(
    id = id,
    name = name,
    image = image,
    votes = votes
)

fun Post.toDto(): PostDto = PostDto(
    id = id,
    name = name,
    image = image,
    votes = votes
)