package com.example.riwaq.Repository;

import com.example.riwaq.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Review findReviewById(Integer id);
    Review findReviewByUser_IdAndBook_Id(Integer userId, Integer bookId);
    List<Review> findReviewsByBook_Id(Integer bookId);
    List<Review> findReviewsByUser_Id(Integer userId);
    List<Review> findAllByOrderByRatingDesc();
    List<Review> findAllByOrderByRatingAsc();
    List<Review> findAllByOrderByCreatedAtDesc();

    Integer countReviewsByBook_Id(Integer bookId);
}
