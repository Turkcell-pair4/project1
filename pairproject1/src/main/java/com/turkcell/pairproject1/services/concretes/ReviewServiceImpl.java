package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewSaveRequest;
import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewUpdateRequest;
import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.repositories.ReviewRepository;
import com.turkcell.pairproject1.services.abstracts.ReviewService;

import java.time.LocalDateTime;
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
    public Review save(ReviewSaveRequest request) {
        Review review = new Review();

        review.setComment(request.comment());
        review.setRating(request.rating());
        review.setProduct(request.product());
        review.setCustomer(request.customer());
        review.setReviewDate(LocalDateTime.now());

        return review;

    }

    @Override
    public Review update(int id, ReviewUpdateRequest request) {
        Optional<Review> review = reviewRepository.findById(id);

        if(review.isEmpty()) {
            throw new RuntimeException("No review found with this id");
        }

        Review updatedReview = review.get();

        updatedReview.setComment(request.comment());
        updatedReview.setRating(request.rating());
        updatedReview.setProduct(request.product());
        updatedReview.setCustomer(request.customer());

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
