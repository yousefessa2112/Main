package com.apolis.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apolis.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
