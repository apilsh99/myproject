package com.productTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productTest.entity.ProductTest;
import com.productTest.repository.ProductTestRepository;

@Service
public class ProductTestService {
	@Autowired
	private ProductTestRepository productTestRepository;
	
	
	public ProductTest saveProductInformation(ProductTest product) {
		return productTestRepository.save(product);
	}
	public List<ProductTest> saveProductList(List<ProductTest> product) {
		return productTestRepository.saveAll(product);
	}
	public ProductTest getProductbyName(int id) {
		
		return productTestRepository.getById(id);
	}
}
