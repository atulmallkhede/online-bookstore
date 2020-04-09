package com.angularwithspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularwithspring.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
