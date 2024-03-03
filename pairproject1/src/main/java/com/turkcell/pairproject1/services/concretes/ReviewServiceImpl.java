package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.repositories.abstracts.ReviewRepository;
import com.turkcell.pairproject1.requests.ReviewSaveRequest;
import com.turkcell.pairproject1.requests.ReviewUpdateRequest;
import com.turkcell.pairproject1.services.abstracts.ReviewService;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review findById(int id) {
        Review review = reviewRepository.findById(id);

        if(review == null) {
            throw new RuntimeException("İlgili Id'ye sahip inceleme bulunamadı!");
        }

        return review;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review save(ReviewSaveRequest request) {
        return reviewRepository.save(request);
    }

    @Override
    public Review update(int id, ReviewUpdateRequest request) {
        return reviewRepository.update(id, request);
    }

    @Override
    public void delete(int id) {
        Review review = reviewRepository.findById(id);

        if(review == null) {
            throw new RuntimeException("İlgili Id'ye sahip inceleme bulunamadı!");
        }

        reviewRepository.delete(id);
    }
}
