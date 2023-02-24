package com.search_student.service;

import java.util.List;

import com.search_student.entities.Student;

public interface StudentService {
	public void saveLead(Student student);

	public List<Student> ListLeads();

	public void deleteLeadById(long id);

	public Student getOneLead(long id);
}
