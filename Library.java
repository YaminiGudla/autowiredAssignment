package com.example.demo.LibraryComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Book;
import com.example.demo.Model.Student;

@Component
public class Library {

	private Book book;
	
	@Autowired
	public Library(Book book) {
		this.book = book;
	}
	
	public void displayBookDetails() {
		System.out.println("Book title: "+book.getTitle());
		System.out.println("Book author: "+book.getAuthor());
	}
}
