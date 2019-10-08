package com.example.service;

import org.springframework.stereotype.Service;

import com.example.PhoneKart.repository.DatabaseQueries;

@Service
public class FutureService {

	DatabaseQueries databaseQueries;
	
	public void addMembers() {
		databaseQueries = new DatabaseQueries();
		
		databaseQueries.addNewRecords();
	}
}
