package com.SMS.Student.StudentManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	@Autowired
		
		private StudentRepository repository;
		
		
		public String addStudent(Student student) {
			
			return repository.addStudent(student);
		}


		

		public List<Student> getAllStudents() {
			
			return repository.getAllStudents();
		}


}
