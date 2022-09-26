package com.example.demo.Model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Book {
	@Id
	private int bookCode;
	private String bookName;
	
 
	@OneToOne(cascade=CascadeType.ALL)
	private Author bookAuthor;
	private String date;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookCode, String bookName, Author bookAuthor, String date) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.date = date;
	}
	
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(Author bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
