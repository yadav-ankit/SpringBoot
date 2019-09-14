package com.example.PhoneKart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PhoneKart.model.Members;


@Repository
public interface MySQLRepository extends JpaRepository<Members, Integer> {

	// List<Members> findByTitleContainingOrContentContaining(String text, String textAgain);
}
