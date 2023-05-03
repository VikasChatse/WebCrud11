package com.example.demo.ServiceI;

import java.util.List;

import com.example.demo.Model.Product;

public interface HServicesI {

	public void savedata(Product p);
	public List<Product> getdata();
}
