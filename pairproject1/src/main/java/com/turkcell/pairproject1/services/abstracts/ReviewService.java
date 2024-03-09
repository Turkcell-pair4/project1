package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewSaveRequest;
import com.turkcell.pairproject1.dtos.requests.ReviewRequests.ReviewUpdateRequest;
import com.turkcell.pairproject1.entities.Review;

import java.util.List;

public interface ReviewService {

    Review findById(int id);
    List<Review> findAll();
    Review save(ReviewSaveRequest request);
    Review update(int id, ReviewUpdateRequest request);
    void delete(int id);
}
