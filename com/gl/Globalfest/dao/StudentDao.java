package com.gl.Globalfest.dao;

import java.util.List;

import com.gl.Globalfest.model.Student;

public interface StudentDao {

	public void saveStudent(Student student);

	public void deleteStudent(int id);

	public Student findByid(int id);

	public List<Student> FindAll();
}