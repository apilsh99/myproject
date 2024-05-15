package com.productTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productTest.entity.ProductTest;
import com.productTest.service.ProductTestService;

@RestController

public class productTestController {
	@Autowired
	private ProductTestService productService;
	
	
	
	@PostMapping("/addProduct")
	public ProductTest addProduct (@RequestBody ProductTest product) {
		
		return productService.saveProductInformation(product);
	
		
	}
	@GetMapping("/getProductbyId/{id}")
	public ProductTest getProductbyID(@PathVariable int id) {
		
		return productService.getProductbyName(id);
	}

}
