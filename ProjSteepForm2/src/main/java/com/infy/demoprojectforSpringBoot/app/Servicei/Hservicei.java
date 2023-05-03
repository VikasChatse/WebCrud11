package com.infy.demoprojectforSpringBoot.app.Servicei;

import java.util.List;

import com.infy.demoprojectforSpringBoot.app.Model.PersonalDetails;
import com.infy.demoprojectforSpringBoot.app.Model.student;

public interface Hservicei {

	public void addstudent(student s);
	public void adddetails(PersonalDetails p);
	public List<student> getstudent();
	public List<PersonalDetails> getdetails();
	
	public void deleteS(int id);
	public void deleteD(int id);
}
