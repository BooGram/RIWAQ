package com.example.riwaq.Repository;

import com.example.riwaq.Model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostLikeRepository extends JpaRepository<PostLike, Integer> {
    PostLike findPostLikeById(Integer id);
    PostLike findPostLikeByUser_IdAndPost_Id(Integer userId, Integer postId);
    List<PostLike> findPostLikesByPost_Id(Integer postId);
}