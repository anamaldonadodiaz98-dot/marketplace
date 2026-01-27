package com.meli.marketplace.service;

import java.util.List;

import com.meli.marketplace.models.Category;

public interface CategoriesService {

    List<Category> getCategories();

    Category postCategories(Category entity);
}
