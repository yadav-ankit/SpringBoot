package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.PhoneKart.DTO.MembersTO;
import com.example.PhoneKart.exceptions.MemberNotFoundException;
import com.example.PhoneKart.model.SchoolComponent;
import com.example.PhoneKart.repository.ClassicRepository;
import com.example.PhoneKart.repository.DatabaseQueries;

@Service
public class FutureService {

	DatabaseQueries databaseQueries;
	ClassicRepository  classicRepository;

	/*
	 * Remove @Qualifier and you won't be able to build your App. No compile time
	 * error but a run time exception.
	 */

	@Autowired
	@Qualifier("math")
	SchoolComponent schoolComponent;

	public void testPlay() {
		schoolComponent.playinSchool();
	}

	public void addMembers(MembersTO memberTO) {
		try {
			databaseQueries = new DatabaseQueries();

			databaseQueries.addNewRecords(memberTO);
			throw new MemberNotFoundException("Just for fun");

		} catch (MemberNotFoundException mem) {
			mem.printStackTrace();
		}

	}

	public void getSomeData() {

		classicRepository.getOrders(); 
	}
}
