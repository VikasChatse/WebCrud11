package com.infy.demoprojectforSpringBoot.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.demoprojectforSpringBoot.app.Model.PersonalDetails;
import com.infy.demoprojectforSpringBoot.app.Model.student;
import com.infy.demoprojectforSpringBoot.app.Repository.Hrepository1;
import com.infy.demoprojectforSpringBoot.app.Repository.Hrepository2;
import com.infy.demoprojectforSpringBoot.app.Servicei.Hservicei;
@Service
public class HserviceImpl implements Hservicei {

	@Autowired
	Hrepository1 hrs;
	
	@Autowired
	Hrepository2 hrp;

	@Override
	public void addstudent(student s) {
		hrs.save(s);
		
	}

	@Override
	public void adddetails(PersonalDetails p) {
		hrp.save(p);
		
	}

	@Override
	public List<student> getstudent() {
	List<student>	g=(List<student>)hrs.findAll();
		return g;
	}

	@Override
	public List<PersonalDetails> getdetails() {
		List<PersonalDetails> t=(List<PersonalDetails>)hrp.findAll();
		return t;
	}

	@Override
	public void deleteS(int id) {
		hrs.deleteById(id);
		
	}

	@Override
	public void deleteD(int id) {
		hrp.deleteById(id);
		
	}
	
	
	
}
