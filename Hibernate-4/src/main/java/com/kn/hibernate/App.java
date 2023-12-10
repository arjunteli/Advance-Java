package com.kn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Arjun Teli", 100);
		Student s2 = new Student(2, "Monica Teli", 90);
		Student s3 = new Student(3, "Nishchita Teli", 35);
		Bike b1 = new Bike(1, "A1", 5600007.876);
		Bike b2 = new Bike(2, "A2", 5656787.876);
		Bike b3 = new Bike(3, "A3", 5987657.876);
		// Configure
		Configuration cfg = new Configuration();
		cfg.configure();
		// Create Factory
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		txn.commit();

	}
}
