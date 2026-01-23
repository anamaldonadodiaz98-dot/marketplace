package com.meli.marketplace.service;

import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Override
    public String getCategories() {
        return "GET: Lista de categorias para el producto ";
    }

    @Override
    public String postCategories(String entity) {
        return entity;
    }

}
