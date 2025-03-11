package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProductModel;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    public void addProduct(ProductModel product) {
         repo.save(product);
    }
    public List<ProductModel> getProducts() {
        return repo.findAll();
    }
    
}
