package com.test.app.controlle;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.app.entity.Sales;
import com.test.app.service.SaleService;

@RestController
@RequestMapping("/sale")
public class SaleController {

	Logger logger = LoggerFactory.getLogger(SaleController.class);
	
	@Autowired
	SaleService saleService;
	
	@GetMapping
	public ResponseEntity<List<Sales>> getSales(){
		logger.info("Getting the Sales datails");	
		List<Sales> list = saleService.getAllSales();
		return new ResponseEntity<List<Sales>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sales> getSaleById(@PathVariable("id") Integer id) {
		Sales sal = saleService.getSaleById(id);
		return new ResponseEntity<Sales>(sal, new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping()
	public HttpStatus deleteById(@RequestParam("id") Integer id){
		logger.info("Deleting the sale details for the sale id"+id);
		saleService.deleteById(id);
		return  HttpStatus.OK;
	}
}
