package com.bestbuy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.dtos.ProductDto;
import com.bestbuy.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ProductDto getAllProducts() {
		return productService.getdummyProduct();
	}
	
	@PostMapping
	public void saveProductProduct(@RequestBody ProductDto product) {
		productService.saveProduct(product);
	}

}
