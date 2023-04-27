package com.stud.service;

import java.util.List;

import com.stud.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long sId);
	Student updateStudent(Student student);
	void deleteStudentById(Long sId);

}
