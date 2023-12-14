package org.kodnest.hibernate_update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	create();
    	//read();
    	//update();
    	//delete();
    	
    }

	public static void delete() {
		Configuration con=new Configuration().configure();
    	//con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	Laptop laptop=session.get(Laptop.class,1);
    	session.delete(laptop);
    	txn.commit();
    	System.out.println("Deleted");
		
	}

	public static void update() {
		Configuration con=new Configuration().configure();
    	//con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	Laptop laptop=session.get(Laptop.class,1);
    	laptop.setLaptopName("Apple");
    	
    	session.save(laptop);
    	txn.commit();
    	System.out.println("---->updated "+laptop);
		
	}

	public static void read() {
		Configuration con=new Configuration().configure();
    	//con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	Laptop laptop=session.get(Laptop.class,1);
    	txn.commit();
    	System.out.println("---->fetched data "+laptop);
		
	}

	public static void create() {

		Configuration con=new Configuration().configure();
    	//con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	Laptop laptop=new Laptop(1,"DELL",136777);
    	session.save(laptop);
    	txn.commit();
    	System.out.println("--->created "+laptop);
    	
    	
		
	}
}
