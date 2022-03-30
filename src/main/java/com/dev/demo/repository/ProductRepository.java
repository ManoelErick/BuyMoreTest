package com.dev.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.dev.demo.entities.Product;

@Component
public class ProductRepository {
	
	Map<Long, Product> map = new HashMap<>();
	
	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}
