package com.example.demo.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String prodName;
	double proPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public Product(int id, String prodName, double proPrice) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.proPrice = proPrice;
	}
	public Product() {
		super();
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", proPrice=" + proPrice + "]";
	}
	
	
	
}
