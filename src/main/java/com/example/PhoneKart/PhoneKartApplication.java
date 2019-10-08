package com.example.PhoneKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.PhoneKart.configurations.PhoneConfig;
import com.example.PhoneKart.model.Book;


@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
//@EnableJpaRepositories("com.example.repository")
public class PhoneKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneKartApplication.class, args);

		
		beanTesting();
		
		System.out.println("UIUIUIUIUI");
	}
	
	public static void beanTesting() {
		
		AnnotationConfigApplicationContext cntxt = new AnnotationConfigApplicationContext(PhoneConfig.class);

		System.out.println("------------------------------");
		Book fck = (Book) cntxt.getBean(Book.class);
		System.out.println(fck.hashCode());

		Book fck1 = (Book) cntxt.getBean(Book.class);
		
		System.out.println("Now different hashcode since its a protype bean");
		System.out.println(fck1.hashCode());
		
		cntxt.close();

	}

}
