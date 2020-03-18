package com.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALES")
public class Sales {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="product_name")
	private String productName;
	@Column(name="store_name")
	private String storeName;
	@Column(name="city")
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Sales() {
	}
	
	public Sales(int id, String productName, String storeName, String city) {
		super();
		this.id = id;
		this.productName = productName;
		this.storeName = storeName;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Sales [id=" + id + ", productName=" + productName + ", storeName=" + storeName + ", city=" + city + "]";
	}
	

	
}
