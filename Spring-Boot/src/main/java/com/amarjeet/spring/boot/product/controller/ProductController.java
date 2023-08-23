package com.amarjeet.spring.boot.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.amarjeet.spring.boot.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
}
