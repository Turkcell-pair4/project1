package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Review;

import java.util.List;

public interface ReviewService {

    Review findById(int id);
    List<Review> findAll();
    Review save(Review review);
    Review update(int id, Review review);
    void delete(int id);
}
