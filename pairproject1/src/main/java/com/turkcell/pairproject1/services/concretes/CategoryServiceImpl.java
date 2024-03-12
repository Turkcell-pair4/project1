package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.entities.Category;
import com.turkcell.pairproject1.repositories.CategoryRepository;
import com.turkcell.pairproject1.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findById(int id) {
        Optional<Category> category = categoryRepository.findById(id);

        if(category.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip kategori bulunamadı!");
        }

        return category.get();
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(CategorySaveRequest request) {
        Category category = CategoryMapper.INSTANCE.convertToCategory(request);

        category =categoryRepository.save(category);

        return category;
    }

    @Override
    public Category update(int id, Category category) {
        Optional<Category> isCategoryExist = categoryRepository.findById(id);

        if(isCategoryExist.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye ait kategori bulunamadı");
        }

        Category updatedCategory = isCategoryExist.get();

        CategoryMapper.INSTANCE.updateCategoryFields(updatedCategory, request);

        updatedCategory = categoryRepository.save(updatedCategory);

        return updatedCategory;
    }

    @Override
    public void delete(int id) {
        Optional<Category> category = categoryRepository.findById(id);

        if(category.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip kategori bulunamadı!");
        }

        categoryRepository.delete(category.get());
    }
}
