package com.example.controller

import com.example.entity.Post
import com.example.service.PostService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * 記事の処理の制御用コントローラ.
 *
 * @author rui.inoue
 */
@Controller
@RequestMapping()
class PostController(private val postService: PostService) {

    @GetMapping()
    fun index(model: Model): String {
        val postList: List<Post> = postService.getAllPosts()
        model.addAttribute("posts", postList)
        return "posts/index"
    }
}