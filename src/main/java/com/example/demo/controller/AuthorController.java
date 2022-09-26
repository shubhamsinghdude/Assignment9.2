package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Author;
import com.example.demo.service.AuthorService;



@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping("/authors")
	public List<Author> getAuthors() {
		return this.authorService.getAllAuthors();
	}

//	@GetMapping("/authors/{id}")
//	public Author getBook(@PathVariable("id") int id) {
//		return this.authorService.getAuthorById(id);
//	}

	@GetMapping("/authors/{name}")
	public Author getAuthor(@PathVariable("name") String name) {
		return this.authorService.getAuthorByName(name);
	}
	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		Author a = this.authorService.addAuthor(author);
		return a;
	}

	@DeleteMapping("/authors/{id}")
	public void deleteAuthor(@PathVariable("Id") int authorId) {
		this.authorService.deleteAuthor(authorId);
	}

	@PutMapping("/authors/{id}")
	public Author updateAuthor(@RequestBody Author author, @PathVariable("id") int authorId) {
		this.authorService.updateAuthor(author, authorId);
		return author;
	}
}
