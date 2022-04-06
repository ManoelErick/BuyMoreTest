package com.dev.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
