package com.meli.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.marketplace.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
