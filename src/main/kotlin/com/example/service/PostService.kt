package com.example.service

import com.example.entity.Post
import com.example.repository.PostRepository
import org.springframework.stereotype.Service

/**
 * 記事の処理.
 *
 * @author rui.inoue
 */
@Service
class PostService(private val postRepository: PostRepository) {

    fun getAllPosts(): List<Post> {
        return postRepository.findAll()
    }
}