package com.turkcell.pairproject1.repositories.abstracts;

import com.turkcell.pairproject1.entities.Category;
import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.requests.CategorySaveRequest;
import com.turkcell.pairproject1.requests.CategoryUpdateRequest;
import com.turkcell.pairproject1.requests.ReviewSaveRequest;
import com.turkcell.pairproject1.requests.ReviewUpdateRequest;

import java.util.List;

public interface ReviewRepository {

    Review findById(int id);
    List<Review> findAll();
    Review save(ReviewSaveRequest request);
    Review update(int id, ReviewUpdateRequest request);
    void delete(int id);
}
