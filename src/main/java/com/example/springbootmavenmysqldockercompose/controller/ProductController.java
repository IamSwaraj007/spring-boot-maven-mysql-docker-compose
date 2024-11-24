package com.example.springbootmavenmysqldockercompose.controller;

import com.example.springbootmavenmysqldockercompose.entity.Product;
import com.example.springbootmavenmysqldockercompose.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/insert")
    public Product insert(@RequestBody Product product) {
        return productService.insertProduct(product);
    }
}
