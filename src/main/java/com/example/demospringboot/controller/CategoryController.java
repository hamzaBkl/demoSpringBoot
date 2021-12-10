package com.example.demospringboot.controller;

import com.example.demospringboot.model.Category;
import com.example.demospringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/categories")

public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/")
    public @ResponseBody
    Iterable<Category> getAllCategories(Model model){
        return categoryRepository.findAll();
    }


}
