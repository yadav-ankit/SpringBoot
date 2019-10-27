package com.example.PhoneKart.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.example.PhoneKart.model.Book;
import com.example.PhoneKart.repository.DatabaseQueries;
import com.example.PhoneKart.repository.MySQLRepository;
import com.example.service.FutureService;

@Configuration
public class PhoneConfig {

	@Bean
	@Scope(value="request")
	public FutureService getService() {
		return new FutureService();
	}
	 
	@Bean
	@Scope(value="prototype")
	public Book getBook() {
		return new Book();
	}
	
	
	
	
}
