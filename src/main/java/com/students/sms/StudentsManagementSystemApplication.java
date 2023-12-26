package com.students.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.students.sms.entity.Student;
import com.students.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentsManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception{
//		Student student1=new Student("pankaj", "rathor", "pankaj@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("pnkj", "rathor", "pankaj@gmail.com");
//		studentRepository.save(student2);
	}

}
