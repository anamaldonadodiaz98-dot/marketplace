package com.meli.marketplace;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CategoriesController {
  
    @GetMapping("/categories")
    public String getMethodName() {
        return "GET: Lista de categorias para el producto ";
    }   
    @PostMapping("/categories")
    public String postMethodName(@RequestBody String entity) {
        
        return entity;
    }
    
}
