package com.angularwithspring.onlinebookstore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.angularwithspring.onlinebookstore.entity.Book;

//@CrossOrigin("http://localhost:4200") // for specific URL
//@CrossOrigin("*") // for all URL
public interface BookRepository extends JpaRepository<Book, Long> {

	@RestResource(path = "category")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);

	@RestResource(path = "searchByKeyword")
	Page<Book> findByNameContainingIgnoreCase(@Param("name") String name, Pageable pageable);

}
