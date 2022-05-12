package com.apolis.main.controller;

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

import com.apolis.main.model.Student;
import com.apolis.main.serviceImplementation.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Student saved");
		studentServiceImpl.saveStudent(student);
		return student;
	}

	@GetMapping(value = "getAllStudents")
	public List<Student> findallStudents() {
		return studentServiceImpl.findAllStudent();

	}
	@PutMapping(value = "updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
		
	}
	@DeleteMapping(value = "deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student deleted!";
	}

}
