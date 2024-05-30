package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public String createNewRecord(Student student) {
		studentRepository.save(student);
		return "Student is Added";
	}

	public List<Student> getAllRecord() {
		return studentRepository.findAll();
	}

	public Optional<Student> getRecordById(Integer id) {
		return studentRepository.findById(id);
	}

	public String updateRecord(Integer id, Student student) {
		
		Optional<Student>stu=studentRepository.findById(id);
		
		if(stu.isPresent()) {
			Student existStu=stu.get();
			
			existStu.setStudentName(student.getStudentName());
			existStu.setStudentAddress(student.getStudentAddress());
			
			studentRepository.save(existStu);
			return "Student id "+id+" is Updated";
		}
		else {
			return "Student id "+id+" is Not Found";
		}
	}

	public String DeleteRecordById(Integer id) {
		studentRepository.deleteById(id);
		return "Student id "+id+" is deleted";
	}

	public String DeleteAllRecord() {
		studentRepository.deleteAll();
		return "All Student is deleted";
	}
}
