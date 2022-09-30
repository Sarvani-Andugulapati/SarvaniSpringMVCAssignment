package com.gl.Globalfest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.Globalfest.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public void saveStudent(Student student) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(student);
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Session session = factory.getCurrentSession();
		Student st = session.get(Student.class, id);
		session.delete(st);
	}

	@Override
	@Transactional
	public Student findByid(int id) {
		Session session = factory.getCurrentSession();
		return session.get(Student.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	@Transactional
	public List<Student> FindAll() {
		Session session = factory.getCurrentSession();
		Criteria c =  session.createCriteria(Student.class);
		return c.list();
	}

}
