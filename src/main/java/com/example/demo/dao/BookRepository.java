package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	public Book findById(int id);
}
