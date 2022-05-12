package com.apolis.main.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apolis.main.dao.StudentRepository;
import com.apolis.main.model.Student;
import com.apolis.main.service.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

}
