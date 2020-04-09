package com.angularwithspring.onlinebookstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.angularwithspring.onlinebookstore.entity.Book;
import com.angularwithspring.onlinebookstore.entity.Category;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Book.class);
		config.exposeIdsFor(Category.class);
	}

}
