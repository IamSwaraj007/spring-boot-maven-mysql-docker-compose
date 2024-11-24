package com.example.springbootmavenmysqldockercompose.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Product")
public class Product {
    private Integer id;
    private String name;
    private double price;
    private Integer qty;
}
