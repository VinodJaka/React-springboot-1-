package com.pragna.StudentSystemManagement.service;

import java.util.List;
import java.util.Optional;

import com.pragna.StudentSystemManagement.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public Optional<Student> getOneStudent(int id);
	public void Delete(int id);
	public Student updateStudent(int id, Student student);

}
