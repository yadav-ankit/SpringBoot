package com.example.PhoneKart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PhoneKart.DTO.MembersTO;


@Repository
public interface MySQLRepository  {

	// List<Members> findByTitleContainingOrContentContaining(String text, String textAgain);
	
	
	public default void addNewRecords(MembersTO memberTO) {};
}
