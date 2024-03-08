package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.repositories.ReviewRepository;
import com.turkcell.pairproject1.services.abstracts.ReviewService;

import java.util.List;
import java.util.Optional;

public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review findById(int id) {
        Optional<Review> review = reviewRepository.findById(id);

        if(review.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip inceleme bulunamadı!");
        }

        return review.get();
    }

    @Override
    public List<Review> findAll() {
        List<Review> reviews = reviewRepository.findAll();

        if(reviews.isEmpty()) {
            throw new RuntimeException("İnceleme bulunamadı");
        }
        return reviews;
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review update(int id, Review review) {
        Optional<Review> reviewOptional = reviewRepository.findById(id);

        if(reviewOptional.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip inceleme bulunamadı");
        }

        Review updatedReview = reviewOptional.get();
        updatedReview = reviewRepository.save(review);

        return updatedReview;
    }

    @Override
    public void delete(int id) {
        Optional<Review> review = reviewRepository.findById(id);

        if(review.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip inceleme bulunamadı!");
        }

        reviewRepository.delete(review.get());
    }
}
