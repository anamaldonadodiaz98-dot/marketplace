package com.meli.marketplace.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.meli.marketplace.models.Category;
import com.meli.marketplace.service.CategoriesService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CategoriesController {
  
    private CategoriesService categoriesService;
    
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }
    
    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoriesService.getCategories();
    }   
    @PostMapping("/categories")
    public Category postCategories(@RequestBody Category category) {
        
        return categoriesService.postCategories(category);
    }
    
}
