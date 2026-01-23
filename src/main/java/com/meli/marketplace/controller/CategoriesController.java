package com.meli.marketplace.controller;

import org.springframework.web.bind.annotation.RestController;

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
    public String getCategories() {
        return categoriesService.getCategories();
    }   
    @PostMapping("/categories")
    public String postCategories(@RequestBody String entity) {
        
        return entity;
    }
    
}
