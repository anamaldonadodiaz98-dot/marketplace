package com.meli.marketplace.service;

import org.springframework.stereotype.Service;

@Service

public class ProductsServiceLmpl implements ProductsService {

    @Override
    public String hello() {
        return "¡Hola! Bienvenido al Marketplace de MELI.";
    }

    @Override
    public String getListProducts() {
        return "GET: Lista de productos";
    }

    @Override
    public String postPrducts(String entity) {
        return entity;
    }
}