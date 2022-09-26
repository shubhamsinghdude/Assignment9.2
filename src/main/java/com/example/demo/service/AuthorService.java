package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Author;
import com.example.demo.dao.AuthorRepository;


@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		List<Author> list=(List<Author>)authorRepository.findAll();
		return list;
	}

	public Author addAuthor(Author author) {
		  Author result=authorRepository.save(author);
	       return result;
	}

	public void deleteAuthor(int authorId) {
	  authorRepository.deleteById(authorId);
	}

	public void updateAuthor(Author author, int authorId) {
	
		author.setAuthorId(authorId);
		authorRepository.save(author);
	}

//	public Author getAuthorById(int id) {
//		Author author=null;
//		try {
//			author=this.authorRepository.findByAuthorId(id);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return author;
//	}

	public Author getAuthorByName(String name) {
		Author author=this.authorRepository.findByAuthorName(name);
		return author;
	}

}
