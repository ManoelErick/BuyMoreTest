package com.dev.demo;

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
		
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Fashion");
		
		Product prod1 = new Product(1L, "Notebook", 2750.99);
		Product prod2 = new Product(2L, "Ternos", 890.00);
		Product prod3 = new Product(3L, "SmarthPhone", 1340.00);
		Product prod4 = new Product(4L, "Camisas", 55.00);
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		productRepository.save(prod1);
		productRepository.save(prod2);
		productRepository.save(prod3);
		productRepository.save(prod4);
		
		
	}
	
	
}
