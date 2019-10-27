package com.example.PhoneKart.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("math")
public class MathComponent implements SchoolComponent {

	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public void playinSchool() {
		System.out.println("Play in Math Class");
		
	}
}
