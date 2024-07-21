package com.example.repository

import com.example.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * postsテーブル操作用のリポジトリ.
 *
 * @author rui.inoue
 */
@Repository
interface PostRepository: JpaRepository<Post, Int> {

}