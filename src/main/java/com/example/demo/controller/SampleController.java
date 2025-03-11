package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping
public class SampleController {
    @Autowired
      ProductService service;
    @GetMapping("/test")
    public String test() {
        return "WORJKING FINE";
    }

    @GetMapping("/check")
    public String check() {
        return "WORJKING FINE";
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductModel product) {
         service.addProduct(product);
    }
    @GetMapping("/products")
    public List<ProductModel> getProducts() {
       return  service.getProducts();
    }
}
