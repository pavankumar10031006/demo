package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel,Integer>{

    
} 
