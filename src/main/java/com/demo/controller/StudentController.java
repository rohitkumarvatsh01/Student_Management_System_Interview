package com.demo.controller;

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

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public String createNewRecord(@RequestBody  Student student) {
		return studentService.createNewRecord(student);
	}
	
	@GetMapping("/get")
	public List<Student>getAllRecord(){
		return studentService.getAllRecord();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Student> getRecordById(@PathVariable Integer id){
		return studentService.getRecordById(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateRecord(@PathVariable Integer id, @RequestBody Student student) {
		return studentService.updateRecord(id, student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteRecordById(@PathVariable Integer id) {
		return studentService.DeleteRecordById(id);
	}
	
	@DeleteMapping("/delete")
	public String DeleteAllRecord() {
		return studentService.DeleteAllRecord();
	}

}
