package com.kn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(01, "Amit", 55);
		Student s2 = new Student(02, "Ajay", 65);
		Student s3 = new Student(03, "Ankit", 75);

		Bike b1 = new Bike(111, "KTM", 34567.54);
		Bike b2 = new Bike(222, "Yamaha", 87654.54);
		Bike b3 = new Bike(333, "Royal Enfield", 9876543.54);
		
		s1.bike = b2;
		s2.bike = b3;
		s3.bike = b1;
		b1.student = s3;
		b2.student = s1;
		b3.student = s2;
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
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
