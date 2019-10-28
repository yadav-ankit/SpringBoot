package com.example.PhoneKart.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.PhoneKart.DTO.MembersTO;
import com.example.PhoneKart.model.Members;

public class DatabaseQueries implements MySQLRepository {

	private static SessionFactory factory;

	public DatabaseQueries() {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	@Override
	public void addNewRecords(MembersTO memberTO) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer personId = null;
		try {
			tx = session.beginTransaction();

			Members person = new Members();
			person.setFull_name(memberTO.getName());
			person.setContact_number(memberTO.getPhone());
			person.setGender(memberTO.getGender());
			person.setAge(memberTO.getAge());
			person.setEmail(memberTO.getEmail());

			personId = (Integer) session.save(person);
			
			Members m = session.load(Members.class,3);
			
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
