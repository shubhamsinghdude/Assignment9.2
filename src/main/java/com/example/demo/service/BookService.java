package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.dao.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;	
	
	//get all book
	public List<Book> getAllBooks(){
		List<Book> list=(List<Book>)bookRepository.findAll();
		return list;
	}
	
	//get single book by id
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookRepository.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//update
	public void updateBook(Book book,int bookId) {
		book.setBookCode(bookId);
		bookRepository.save(book);
	}

	
	//add book
	public Book addBook(Book b) {
	   Book result=bookRepository.save(b);
       return result;
	}
	
	
	//delete
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}
	
	



	

}
