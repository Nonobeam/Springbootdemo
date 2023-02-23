package com.example.Springbootdemo.controller;

import com.example.Springbootdemo.models.Product;
import com.example.Springbootdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    List<Product> getAllProducts(){
        return repository.findAll();
    }

}
