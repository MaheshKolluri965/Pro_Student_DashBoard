package com.student.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dashboard.model.Student;
import com.student.dashboard.services.StudentService;

@RestController 		// for making rest api calls
@CrossOrigin(allowedHeaders = "*", origins = "*")		// for making calls from angular
public class StudentDashboardController {
	
	@Autowired
	private StudentService studService;
	
	@PostMapping("/registerStudent") 		// Sends the data from the body
	public Student registerStudentContrl(@RequestBody Student student) {
		return studService.registerStudentServ(student);	
	}
	
	@GetMapping("/getStudents")            // Fetch the data of all student
	public List<Student> getStudentsContrl(){
		return studService.getStudentsServ();
	}
	
	@DeleteMapping("/deleteStudent")		// Delete the data by id, RequestParam will try to find the id in url 
	public void deleteStudentContrl(@RequestParam Integer id) {
		studService.deleteStudentServ(id);
	}
	
	@PutMapping("/updateStudent")			//update student
	public Student updateStudentContrl(@RequestBody Student student) {
		return studService.updateStudentServ(student);
	}

}
