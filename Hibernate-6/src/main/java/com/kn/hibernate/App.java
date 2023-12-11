package com.kn.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Product p1 = new Product(111, "KeyBoard", 1000.56);
		Product p2 = new Product(222, "Mouse", 700.56);
		Product p3 = new Product(333, "TV", 156900.56);
		Product p4 = new Product(444, "Camera", 43000.56);
		Customer c1 = new Customer(1, "Amit", 22);
		Customer c2 = new Customer(2, "Ajay", 23);
		List<Product> list1 = new ArrayList<Product>();
		List<Product> list2 = new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);
		list2.add(p3);
		list2.add(p4);
		c1.setProducts(list1);
		c2.setProducts(list2);
		p1.setCustomer(c1);
		p2.setCustomer(c1);
		p3.setCustomer(c2);
		p4.setCustomer(c2);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		txn.commit();

	}

}
