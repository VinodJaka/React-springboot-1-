package com.pragna.StudentSystemManagement.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragna.StudentSystemManagement.model.Student;
import com.pragna.StudentSystemManagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "new student is added";
		
	}
	
	@GetMapping("/all")
	public List<Student> all(){
		return studentService.getAllStudent();
		
	}
	@GetMapping("/{id}")
	public Optional<Student> oneStudent(@PathVariable int id){
		return studentService.getOneStudent(id);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id){
		studentService.Delete(id);
		return "Deleted Student id : " +id;
		
	}
	
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {
		studentService.updateStudent(id,student);
		return "student updated";
		
	}
	

}
