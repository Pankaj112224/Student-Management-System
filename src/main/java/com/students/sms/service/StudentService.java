package com.students.sms.service;

import java.util.List;

import com.students.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student upadateStudent(Student student);
	
	void deleteStudentById(Long id );
}
