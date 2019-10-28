package com.example.PhoneKart.repository;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class ClassicRepository {

	private static SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	public void getOrders() {
		Session session = null;
		Transaction tx;
		Query query; 
		try {
			sessionFactory =   new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
			session  = sessionFactory.getCurrentSession();

			 tx = session.beginTransaction();

			 query = session
					.createQuery("select c.customerName , count(c.customerName) from Customers c join Orders "
							+ "o on c.customerNumber = o.customerNumber group by c.customerName");

			System.out.println(" ---------------------------------------");

			System.out.println(" ---------------------------------------");

			List<Object[]> list = query.getResultList();
			
			for (Object[] arr : list) {
				System.out.println(Arrays.toString(arr));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			session.close();
		}

	}
}
