package com.stud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stud.entity.Student;
import com.stud.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student );
		return "create_student";
		
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{sId}")
	public String editStudentForm(@PathVariable Long sId, Model model) {
		model.addAttribute("student", studentService.getStudentById(sId));
		return "edit_student";
		
	}
	
	@PostMapping("/students/{sId}")
	public String updateStudent(@PathVariable Long sId, @ModelAttribute("student") Student student, Model model) {
		
		Student existStudent = studentService.getStudentById(sId);
		existStudent.setsFirstName(student.getsFirstName());
		existStudent.setsLastName(student.getsLastName());
		existStudent.setsEmail(student.getsEmail());
		
		studentService.updateStudent(existStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{sId}")
	public String deleteStudent(@PathVariable Long sId) {
		studentService.deleteStudentById(sId);
		
		return "redirect:/students";
		
	}
}
