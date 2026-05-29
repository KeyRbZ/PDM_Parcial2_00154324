package com.pdmcourse2026.basictemplate.data.api.repository


import com.pdmcourse2026.basictemplate.domain.model.Post

interface PostRepository {
    suspend fun getPosts(): Result<List<Post>>
    suspend fun createPost(post: Post): Result<Post>
}
