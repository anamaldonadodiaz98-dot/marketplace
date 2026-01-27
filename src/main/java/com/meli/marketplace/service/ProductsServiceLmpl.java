package com.meli.marketplace.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meli.marketplace.models.Product;
import com.meli.marketplace.repository.ProductsRepository;

@Service

public class ProductsServiceLmpl implements ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsServiceLmpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public String hello() {
        return "¡Hola! Bienvenido al Marketplace de MELI.";
    }

    @Override
    public List<Product> getListProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Product postProducts(Product entity) {
        return productsRepository.save(entity);
    }
}