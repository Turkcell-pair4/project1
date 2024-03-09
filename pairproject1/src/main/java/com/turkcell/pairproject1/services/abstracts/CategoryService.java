package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.dtos.requests.CategoryRequests.CategorySaveRequest;
import com.turkcell.pairproject1.dtos.requests.CategoryRequests.CategoryUpdateRequest;
import com.turkcell.pairproject1.entities.Category;

import java.util.List;

public interface CategoryService {
    Category findById(int id);
    List<Category> findAll();
    Category save(Category category);
    Category update(int id, Category category);
    void delete(int id);
}
