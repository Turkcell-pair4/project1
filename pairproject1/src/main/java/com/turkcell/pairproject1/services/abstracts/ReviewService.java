package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.requests.ReviewSaveRequest;
import com.turkcell.pairproject1.requests.ReviewUpdateRequest;

import java.util.List;

public interface ReviewService {

    Review findById(int id);
    List<Review> findAll();
    Review save(ReviewSaveRequest request);
    Review update(int id, ReviewUpdateRequest request);
    void delete(int id);
}
