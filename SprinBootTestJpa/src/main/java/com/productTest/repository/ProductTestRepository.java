package com.productTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productTest.entity.ProductTest;

public interface ProductTestRepository extends JpaRepository<ProductTest,Integer> {
	

}
