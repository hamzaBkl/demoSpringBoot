package com.example.demospringboot.controller;

import com.example.demospringboot.model.Category;
import com.example.demospringboot.model.Product;
import com.example.demospringboot.repository.CategoryRepository;
import com.example.demospringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/products")

public class ProductController {

    @Autowired
    ProductRepository repository;

    @RequestMapping("/")
    public @ResponseBody
    Iterable<Product> getAllProducts(Model model){
        return repository.findAll();
    }


}
