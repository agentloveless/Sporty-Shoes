package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Products;
import com.example.app.repository.ProductRepository;



@RestController
@RequestMapping("Products")
public class ProductController {
	
	@Autowired
	ProductRepository productrepository;
	
	// retrieve all student from database
		@GetMapping("all")
		public List<Products> getAllProducts()
		{
			List<Products> products=(List<Products>) productrepository.findAll();
			return products;
		}
		
		// insert new student into database
		@PostMapping("add")
		public Products addProducts(@RequestBody Products products)
		{
			return productrepository.save(products);
		}
		
		// get particular student by their ID
		@GetMapping("products/{id}")
		public Optional<Products> getProductsID(@PathVariable int id)
		{
			return productrepository.findById(id);
		}
		
		// update existing student 
		@PutMapping("update/{id}")
		public Products updateProducts(@RequestBody Products products)
		{
			return productrepository.save(products);
		}
		
		// delete particular student from database
		@DeleteMapping("delete/{id}")
		public void deleteProducts(@PathVariable int id)
		{
			productrepository.deleteById(id);
		}

}
