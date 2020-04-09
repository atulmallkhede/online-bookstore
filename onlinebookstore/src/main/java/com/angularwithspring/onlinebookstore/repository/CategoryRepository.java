package com.angularwithspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.angularwithspring.onlinebookstore.entity.Category;

@RepositoryRestResource(collectionResourceRel = "categories", path = "book-categories")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
