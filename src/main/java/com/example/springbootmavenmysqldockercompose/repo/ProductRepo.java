package com.example.springbootmavenmysqldockercompose.repo;

import com.example.springbootmavenmysqldockercompose.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}