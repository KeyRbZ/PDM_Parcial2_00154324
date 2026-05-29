package com.pdmcourse2026.basictemplate.data.api.repository

import com.pdmcourse2026.basictemplate.data.api.KtorClient
import com.pdmcourse2026.basictemplate.data.api.dto.PostDto
import com.pdmcourse2026.basictemplate.data.api.dto.toDto
import com.pdmcourse2026.basictemplate.data.api.dto.toModel
import com.pdmcourse2026.basictemplate.domain.model.Post
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

private const val BASE_URL = "https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca"

class PostApiRepository : PostRepository {

    private val client = KtorClient.client

    override suspend fun getPosts(): Result<List<Post>> {
        return try {
            val response: List<PostDto> = client
                .get("$BASE_URL/posts")
                .body()
            Result.success(response.map { it.toModel() })
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun createPost(post: Post): Result<Post> {
        return try {
            val response: PostDto = client
                .post("$BASE_URL/posts") {
                    contentType(ContentType.Application.Json)
                    setBody(post.toDto())
                }
                .body()
            Result.success(response.toModel())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}


