package com.stud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stud.entity.Student;
import com.stud.repository.StudentRepository;
import com.stud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository  studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long sId) {
		
		return studentRepository.findById(sId).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long sId) {
		
		studentRepository.deleteById(sId);
	}

}
