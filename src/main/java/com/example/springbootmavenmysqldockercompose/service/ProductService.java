package com.example.springbootmavenmysqldockercompose.service;

import com.example.springbootmavenmysqldockercompose.entity.Product;

import java.util.List;

public interface ProductService {
    Product insertProduct(Product product);

    List<Product> getProducts();
}
