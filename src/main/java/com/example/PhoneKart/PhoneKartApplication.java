package com.example.PhoneKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
//@EnableJpaRepositories("com.example.repository")
public class PhoneKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneKartApplication.class, args);
		
		System.out.println("UIUIUIUIUI");
	}

}
