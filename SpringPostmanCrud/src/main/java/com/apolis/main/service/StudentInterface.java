package com.apolis.main.service;

import java.util.List;

import com.apolis.main.model.Student;

public interface StudentInterface {
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public List<Student> findAllStudent();
	
	public void deleteStudent(int id);

}
