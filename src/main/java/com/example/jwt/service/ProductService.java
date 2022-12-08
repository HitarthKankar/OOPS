package com.example.jwt.service;

import com.example.jwt.dao.ProductDao;
import com.example.jwt.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;
    public Product addNewProduct(Product product )
    {
        Product p=productDao.save(product);
        return p;
    }
}
