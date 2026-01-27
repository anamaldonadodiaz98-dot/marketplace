package com.meli.marketplace.service;

import java.util.List;

import com.meli.marketplace.models.Product;

public interface ProductsService {

    String hello();

    List<Product> getListProducts();

    Product postProducts(Product entity);

}
