package com.infy.demoprojectforSpringBoot.app.Controller1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.infy.demoprojectforSpringBoot.app.Model.PersonalDetails;
import com.infy.demoprojectforSpringBoot.app.Model.student;
import com.infy.demoprojectforSpringBoot.app.Servicei.Hservicei;
@CrossOrigin("*")
@RestController
public class Hcontroller {

	@Autowired
	Hservicei hs;
	
	@PostMapping("/addstudent")
	public String poststudent(@RequestBody student s) {
		
		hs.addstudent(s);
		return "Data Added";
	}
	
	@PostMapping("/adddetails")
	public String postdetails(@RequestBody PersonalDetails p) {
		
		hs.adddetails(p);
		return "Details  Added";
	}
	
	@GetMapping("/getstudent")
	public List<student> getProd(){
		List<student> l=hs.getstudent();
		return l;
	}
	
	@GetMapping("/getdetails")
	public List<PersonalDetails> getDetail(){
		List<PersonalDetails> l=hs.getdetails();
		return l;
	}
	
	@DeleteMapping("/deletestu/{id}")
	public void deleteS(@PathVariable int id) {
		hs.deleteS(id);
	}
	
	@DeleteMapping("/deletedetail/{id}")
	public void deleteD(@PathVariable int id) {
		hs.deleteD(id);
	}
	
	@PutMapping("/updatestudent")
	public String editsup(@RequestBody student s) {
		
		hs.addstudent(s);
		return"Updated Student";
	}
	
	@PutMapping("/updatedetails")
	public String editsup(@RequestBody PersonalDetails s) {
		
		hs.adddetails(s);
		return"Updated Details";
	}
	
}
