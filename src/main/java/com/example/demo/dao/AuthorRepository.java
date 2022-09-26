package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	public Author findByAuthorId(int id);

	@Query("select a from Author a where a.authorName=:name ")
	public Author findByAuthorName(@Param("name") String name);
}