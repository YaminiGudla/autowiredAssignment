package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.LibraryComponent.Classroom;
import com.example.demo.LibraryComponent.Library;
import com.example.demo.Model.Book;
import com.example.demo.Model.Student;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication {
	
	@Bean
	public Book book() {
		return new Book("It ends with us","Coolean Hoover");
	}
	
	@Bean
	public Library library(Book book) {
		return new Library(book);
	}
	
	@Bean
	public Student student() {
		return new Student("Yamini",22);
	}
	
	@Bean
	public Classroom classroom(Student student) {
		return new Classroom(student);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
