package com.example.PhoneKart.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.PhoneKart.repository.DatabaseQueries;
import com.example.PhoneKart.repository.MySQLRepository;
import com.example.service.FutureService;

@Configuration
public class PhoneConfig {

	@Bean
	public FutureService getService() {
		return new FutureService();
	}
	
	
}
