package com.student.dashboard.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dashboard.model.Student;
import com.student.dashboard.repository.StudentRepository;

// Service Layer --> Interacts with the repository i.e DB

@Service 					// spring get to know that it is a service class
public class StudentService {
	
	@Autowired   // for auto_wiring
	private StudentRepository studRepo;
	
	public Student registerStudentServ(Student student) {
		return studRepo.save(student);	
	}
	
	public List<Student> getStudentsServ(){
		return (List<Student>) studRepo.findAll();
	}
	
	public void deleteStudentServ(Integer id) {
		studRepo.deleteById(id);
	}
	
	public Student updateStudentServ(Student student) {
		Integer rollNumber = student.getStdRollNumber();
		Student std = studRepo.findById(rollNumber).get();
		std.setStdName(student.getStdName());
		std.setStdPercentage(student.getStdPercentage());
		std.setStdAddress(student.getStdAddress());
		return studRepo.save(std);
		
	}

}
