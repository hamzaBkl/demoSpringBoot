package com.example.demospringboot.repository;

import com.example.demospringboot.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface  CategoryRepository extends CrudRepository<Category, Integer> {
}
