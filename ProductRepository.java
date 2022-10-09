package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.app.model.Products;

public interface ProductRepository extends CrudRepository<Products, Integer>{

}
