package com.example.springbootmavenmysqldockercompose.service.impl;

import com.example.springbootmavenmysqldockercompose.entity.Product;
import com.example.springbootmavenmysqldockercompose.repo.ProductRepo;
import com.example.springbootmavenmysqldockercompose.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}