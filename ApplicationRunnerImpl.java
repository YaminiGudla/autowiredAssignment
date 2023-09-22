package com.example.demo.AplComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.LibraryComponent.Classroom;
import com.example.demo.LibraryComponent.Library;
import com.example.demo.Model.Book;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner{

	
	@Autowired
	private Classroom classroom;
	
	@Autowired
	private Library library;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		library.displayBookDetails();
		classroom.displayStudentDetails();
		
	}

}
