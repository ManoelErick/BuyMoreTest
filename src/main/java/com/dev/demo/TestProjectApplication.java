package com.dev.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.demo.entities.Category;
import com.dev.demo.entities.Product;
import com.dev.demo.repository.CategoryRepository;
import com.dev.demo.repository.ProductRepository;

@SpringBootApplication
public class TestProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Fashion");
		Category cat3 = new Category(null, "Kitchen");
		
		Product prod1 = new Product(null, "Notebook", 2750.99, cat1);
		Product prod2 = new Product(null, "Ternos", 890.00, cat2);
		Product prod3 = new Product(null, "SmarthPhone", 1340.00, cat1);
		Product prod4 = new Product(null, "Camisas", 55.00, cat2);
		Product prod5 = new Product(null, "Kit Panelas", 367.00, cat3);
		Product prod6 = new Product(null, "Pratos", 139.90, cat3);
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		
		productRepository.save(prod1);
		productRepository.save(prod2);
		productRepository.save(prod3);
		productRepository.save(prod4);
		productRepository.save(prod5);
		productRepository.save(prod6);
		
		cat1.getProducts().addAll(Arrays.asList(prod1, prod3));
		cat2.getProducts().addAll(Arrays.asList(prod2, prod4));
		cat3.getProducts().addAll(Arrays.asList(prod5, prod6));
		
		
	}
	
	
}
