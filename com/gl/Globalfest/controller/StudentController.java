package com.gl.Globalfest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.Globalfest.dao.StudentDao;
import com.gl.Globalfest.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentDao studentdao;
	@GetMapping("/list")
	public String listStudents(Model model) {
		List<Student>students = studentdao.FindAll();
		model.addAttribute("students", students);
		return "Student-list";
	}
	@GetMapping("StudentReg")
		public String Studentsreg(Model model) {
			Student st = new Student();
			model.addAttribute("student",st);
			return "StudentReg";
		}
@PostMapping("save")
public String saveStudentdata(Model model,@ModelAttribute("student")Student student) {
	studentdao.saveStudent(student);
	return "redirect:/students/list";
}
@GetMapping("edit")
public String updateStudent(Model model, @RequestParam("id")int id) {
	Student student = studentdao.findByid(id);
	System.out.println(student);
	model.addAttribute("student",student);
	return "StudentReg";
}
@GetMapping("delete")
public String deleteStudent(Model model, @RequestParam("id")int id) {
	studentdao.deleteStudent(id);
	return "redirect:/students/list";
}
}
