package com.meli.marketplace.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.marketplace.models.Product;
import com.meli.marketplace.service.ProductsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductsController {

    private ProductsService productsService;
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }   

    @GetMapping("/")
    public String hello() {
        return productsService.hello();
    }
    @GetMapping("/products")
    public List<Product> getListProducts() {
        return productsService.getListProducts();
    }
    @PostMapping("/products")
    public Product postProducts(@RequestBody Product product) {
        
        return productsService.postProducts(product);
    }
    

}
