package com.meli.marketplace.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meli.marketplace.models.Category;
import com.meli.marketplace.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Category> getCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Category postCategories(Category category) {
        return categoriesRepository.save(category);
    }

}
