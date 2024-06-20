package com.pragna.StudentSystemManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragna.StudentSystemManagement.model.Student;
import com.pragna.StudentSystemManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getOneStudent(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public void Delete(int id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(int id, Student student) {
		Optional<Student> exsitingStudent=studentRepository.findById(id);
		if(exsitingStudent.isPresent()) {
			Student updateStudent=exsitingStudent.get();
			updateStudent.setName(student.getName());
			updateStudent.setAddress(student.getAddress());
			return studentRepository.save(updateStudent);
		}
		else {
            throw new RuntimeException("Student not found with id " + id);
        }
	}



}
