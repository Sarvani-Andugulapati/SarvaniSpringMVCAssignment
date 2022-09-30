package com.gl.Globalfest.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String Department;
private String Country;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getCountry() {
	return Country;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Department=" + Department + ", Country=" + Country + "]";
}
public Student(String name, String department, String country) {
	super();
	this.name = name;
	Department = department;
	Country = country;
}
public Student() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setCountry(String country) {
	Country = country;
}

}
