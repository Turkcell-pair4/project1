package com.turkcell.pairproject1.repositories.concretes;

import com.turkcell.pairproject1.entities.Product;
import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.repositories.abstracts.ReviewRepository;
import com.turkcell.pairproject1.requests.ReviewSaveRequest;
import com.turkcell.pairproject1.requests.ReviewUpdateRequest;

import java.util.List;

public class ReviewRepositoryImpl implements ReviewRepository {

    private final List<Review> reviewList;

    public ReviewRepositoryImpl(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
    @Override
    public Review findById(int id) {
        return reviewList.
                stream().filter(review -> review.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Review> findAll() {
        return reviewList;
    }

    @Override
    public Review save(ReviewSaveRequest request) {
        Review review = new Review();
        review.setId(request.id());
        review.setComment(request.comment());
        review.setRating(request.rating());
        reviewList.add(review);
        return review;
    }

    @Override
    public Review update(int id, ReviewUpdateRequest request) {
        Review review = this.findById(id);
        review.setComment(request.comment());
        review.setRating(request.rating());
        return review;
    }

    @Override
    public void delete(int id) {
        reviewList.remove(this.findById(id));
    }
}
