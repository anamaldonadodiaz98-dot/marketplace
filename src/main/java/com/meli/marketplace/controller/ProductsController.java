package com.meli.marketplace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductsController {

    @GetMapping("/")
    public String hello() {
        return "¡Hola! Bienvenido al Marketplace de MELI.";
    }
    @GetMapping("/products")
    public String getMethodName() {
        return "GET: Lista de productos";
    }
    @PostMapping("/products")
    public String postMethodName(@RequestBody String entity) {
        
        return entity;
    }
    

}
