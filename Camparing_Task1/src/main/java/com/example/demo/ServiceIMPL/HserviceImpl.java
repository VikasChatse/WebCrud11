package com.example.demo.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.HRepository;
import com.example.demo.ServiceI.HServicesI;

@Service
public class HserviceImpl implements HServicesI {

	@Autowired
	HRepository hr;

	@Override
	public void savedata(Product p) {
		hr.save(p);
		
	}

	@Override
	public List<Product> getdata() {
		
	List<Product>pl	=(List<Product>)hr.findAll();
		return pl;
	}
	
	
	
}
