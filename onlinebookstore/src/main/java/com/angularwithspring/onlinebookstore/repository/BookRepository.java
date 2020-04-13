package com.angularwithspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.angularwithspring.onlinebookstore.entity.Book;

@CrossOrigin("http://localhost:4200") // for specific URL
// @CrossOrigin("*")//for all URL
public interface BookRepository extends JpaRepository<Book, Long> {

}
