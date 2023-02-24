package com.search_student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search_student.entities.Student;
import com.search_student.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
		@Override
		public void saveLead(Student student) {
			studentRepo.save(student);
		}
		@Override
		public List<Student> ListLeads() {
	    List<Student>students =studentRepo.findAll();
			return students;
		}
		@Override
		public void deleteLeadById(long id) {
			studentRepo.deleteById(id);		
		}
		@Override
		public Student getOneLead(long id) {
			Optional<Student> findById = studentRepo.findById(id);
			Student student = findById.get();
			return student;
		}

	}
