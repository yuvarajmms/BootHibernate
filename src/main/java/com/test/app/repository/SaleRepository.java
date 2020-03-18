package com.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.app.entity.Sales;

@Repository
public interface SaleRepository extends JpaRepository<Sales, Integer> {
	
}