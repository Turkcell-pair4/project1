package com.turkcell.pairproject1.controllers;

import com.turkcell.pairproject1.entities.Review;
import com.turkcell.pairproject1.requests.ReviewSaveRequest;
import com.turkcell.pairproject1.requests.ReviewUpdateRequest;
import com.turkcell.pairproject1.services.abstracts.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable int id) {
        return reviewService.findById(id);
    }

    @PostMapping
    public Review save(@RequestBody ReviewSaveRequest request) {
        return reviewService.save(request);
    }

    @PutMapping("/{id}")
    public Review update(@PathVariable int id, @RequestBody ReviewUpdateRequest request) {
        return reviewService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }
}
