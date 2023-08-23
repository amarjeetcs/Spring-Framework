package com.amarjeet.spring.boot.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amarjeet.spring.boot.product.model.Product;
import com.amarjeet.spring.boot.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> saveListOfProduct(List<Product> product)
	{
		return repository.saveAll(product);
	}
	
	public List<Product> getProducts()
	{
		return repository.findAll();
	}
	
	public List<Product> getProductById(int id)
	{
		return repository.findById();
	}
}
