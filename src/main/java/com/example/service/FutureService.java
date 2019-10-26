package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.PhoneKart.DTO.MembersTO;
import com.example.PhoneKart.exceptions.MemberNotFoundException;
import com.example.PhoneKart.repository.DatabaseQueries;

@Service
public class FutureService {

	DatabaseQueries databaseQueries;

	public void addMembers(MembersTO memberTO)  {
		
		try {
			databaseQueries = new DatabaseQueries();

			databaseQueries.addNewRecords(memberTO);
			throw new MemberNotFoundException("Just for fun");
			
		}catch(MemberNotFoundException mem) {
			mem.printStackTrace();
		}
		
	}
	
	public List<String> getSomeData(int x, String y) {
		
		return Arrays.asList("Ankit" , "Hemant");
	}
}
