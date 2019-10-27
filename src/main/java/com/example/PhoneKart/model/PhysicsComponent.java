package com.example.PhoneKart.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("physics")
public class PhysicsComponent implements SchoolComponent {

	@Override
	public void playinSchool() {
		System.out.println("Play in Physics Class");
		
	}
}
