package com.dev.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.demo.entities.Product;
import com.dev.demo.repository.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository productRepository;

		@GetMapping
		public ResponseEntity<List<Product>> findAll() {
			List<Product> prods = productRepository.findAll();
			return ResponseEntity.ok().body(prods);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Product> findById(@PathVariable Long id) {
			Product prod = productRepository.findById(id).get();
			return ResponseEntity.ok().body(prod);
		}
}
