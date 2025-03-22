package com.github.categories.service;

import com.github.categories.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Integer id);
    Category createCategory(Category category);
    Category updateCategory(Integer id, Category category);
    void deleteCategory(Integer id);
}