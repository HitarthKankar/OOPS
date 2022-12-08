package com.example.jwt.controller;

import com.example.jwt.entity.Product;
import com.example.jwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;
    @PostMapping({"/addNewProduct"})
    public Product addNewProduct(@RequestBody Product product)
    {
        return productService.addNewProduct(product);
    }
}

