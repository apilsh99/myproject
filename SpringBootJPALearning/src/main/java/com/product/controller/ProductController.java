package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProductInformation(product);
	}
	

}
