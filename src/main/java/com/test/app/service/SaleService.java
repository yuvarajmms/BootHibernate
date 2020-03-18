package com.test.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.entity.Sales;
import com.test.app.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository saleRepo;
	
	public List<Sales> getAllSales(){
		List<Sales> saleList =saleRepo.findAll();
		if(saleList.size() > 0){
			return saleList;
		} else {
			return new ArrayList<>();
		}
	}
	
	public Sales getSaleById(Integer id){
		Optional<Sales> opt = saleRepo.findById(id);
		return opt.get();
	}
	
	public void deleteById(Integer id){
		saleRepo.deleteById(id);
	}
	
}
