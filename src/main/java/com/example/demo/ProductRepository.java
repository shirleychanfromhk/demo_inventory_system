package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findByProductId(String productId);
	List<Product> findAll();
	Product findByProductIdAndLocation(String productId, String location);
}
