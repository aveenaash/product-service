package com.bestbuy.services;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbuy.dtos.ProductDto;
import com.bestbuy.entities.ProductEntity;
import com.bestbuy.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductDto getdummyProduct() {
		ProductDto p = new ProductDto();
		p.setName("Iphone xs");
		p.setPrice(100.23);
		p.setDescription("very good phone");
		return p;
	}
	
	public void saveProduct(ProductDto productDto) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setDescription(productDto.getDescription());
		productEntity.setName(productDto.getName());
		productEntity.setPrice(productDto.getPrice());
		productEntity.setUuid(UUID.randomUUID().toString());
		
		productRepository.save(productEntity);
	}
}
