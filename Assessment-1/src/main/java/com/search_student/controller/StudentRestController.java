package com.search_student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search_student.entities.Student;
import com.search_student.service.StudentService;


@RestController
@RequestMapping("/api/students")
public class StudentRestController {
@Autowired
private StudentService studentService;


@GetMapping
public List<Student> getAllLeads(){
	List<Student> leads = studentService.ListLeads();
	return leads;
}
@PostMapping
public void saveOnelead(@RequestBody Student lead) {
	studentService.saveLead(lead);
}
@DeleteMapping("/delete/{id}")
public void deleteOnelead( @PathVariable("id") long id) {
	studentService.deleteLeadById(id);
} 
@PutMapping
public void updateOneLead(@RequestBody Student lead) {
	studentService.saveLead(lead);
}
@GetMapping("/lead/{id}")
public Student getOneLead(@PathVariable("id")long id) {
	Student lead =studentService.getOneLead(id);
	return lead;
}
}
