package com.example.demo.Controller1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.ServiceI.HServicesI;
@CrossOrigin("*")
@RestController
public class HController {

	@Autowired
	HServicesI hs;
	
	@PostMapping("/addproduct")
	public String data(@RequestBody Product p) {
		
		hs.savedata(p);
		return "DATA Added";
	}
	
	@GetMapping("/getdata")
	public List<Product> getdata(){
		
		List<Product> p = hs.getdata();
		return p.stream().sorted(Comparator.comparing(Product::getProPrice).reversed().
				thenComparing(Product::getProdName).thenComparing(Product::getId)).collect(Collectors.toList());
	}
}
