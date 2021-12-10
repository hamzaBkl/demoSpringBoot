package com.example.demospringboot.repository;

import com.example.demospringboot.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
