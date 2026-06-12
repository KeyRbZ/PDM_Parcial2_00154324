package com.pdmcourse2026.basictemplate.data.remote.dto

import com.pdmcourse2026.basictemplate.domain.model.Post
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PostDto(
    @SerialName("id")
    val id: Int = 0,

    @SerialName("name")
    val name: String = "",

    @SerialName("imageUrl")
    val imageUrl: String = "",

    @SerialName("votes")
    val votes: Int = 0,
    )

fun PostDto.toModel(): Post = Post(
    id = id,
    name = name,
    imageUrl = imageUrl,
    votes = votes
)

@Serializable
data class VoteRequestDto(
    @SerialName("optionId")
    val placeId: Int
)