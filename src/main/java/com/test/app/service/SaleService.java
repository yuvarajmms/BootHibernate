package com.test.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.app.entity.Sales;
import com.test.app.repository.SaleRepository;

@Service
public class SaleService {
	
	Logger logger = LoggerFactory.getLogger(SaleService.class);
	
	@Autowired
	SaleRepository saleRepo;
	
	public List<Sales> getAllSales(){
		List<Sales> saleList =saleRepo.findAll();
		logger.info("Sales List size:"+saleList.size());
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
		logger.info("Delete sale for:"+id);
		saleRepo.deleteById(id);
	}
	
}
