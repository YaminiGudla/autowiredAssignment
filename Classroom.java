package com.example.demo.LibraryComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Student;

@Component
public class Classroom {

	private Student student;
	
	@Autowired
	public Classroom(Student student) {
		this.student = student;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student name: "+student.getName());
		System.out.println("Student age: "+student.getAge());
	}
}
