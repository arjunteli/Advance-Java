package org.kodnest.hibernate_mtm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee e1=new Employee(1,"Amit", 'C');
    	Employee e2=new Employee(2,"Ankit", 'B');
    	Employee e3=new Employee(3,"Akash", 'A');
    	Employee e4=new Employee(4,"Ankur", 'C');
    	Employee e5=new Employee(5,"Anjali", 'A');
    	List<Employee> list1=new ArrayList<Employee>();
    	list1.add(e1);
    	list1.add(e3);
    	list1.add(e5);
    	List<Employee> list2=new ArrayList<Employee>();
    	list2.add(e2);
    	list2.add(e3);
    	list2.add(e5);
    	List<Employee> list3=new ArrayList<Employee>();
    	list3.add(e1);
    	list3.add(e2);
    	list3.add(e3);
    	list3.add(e4);
    	list3.add(e5);
    	List<Employee> list4=new ArrayList<Employee>();
    	list4.add(e1);
    	list4.add(e4);
    	list4.add(e5);
    	
    	Technology t1=new Technology(111,"Java");
    	Technology t2=new Technology(222,"Python");
    	Technology t3=new Technology(333,"MySQL");
    	Technology t4=new Technology(444,"React");
    	List<Technology> tlist1=new ArrayList<Technology>();
    	tlist1.add(t1);
    	tlist1.add(t3);
    	tlist1.add(t4);
    	List<Technology> tlist2=new ArrayList<Technology>();
    	tlist2.add(t2);
    	tlist2.add(t3);
    	List<Technology> tlist3=new ArrayList<Technology>();
    	tlist3.add(t1);
    	tlist3.add(t2);
    	tlist3.add(t3);
    	List<Technology> tlist4=new ArrayList<Technology>();
    	tlist4.add(t3);
    	tlist4.add(t4);
    	List<Technology> tlist5=new ArrayList<Technology>();
    	tlist5.add(t1);
    	tlist5.add(t2);
    	tlist5.add(t3);
    	tlist5.add(t4);
    	
    	e1.setTechnology(tlist1);
    	e2.setTechnology(tlist2);
    	e3.setTechnology(tlist3);
    	e4.setTechnology(tlist4);
    	e5.setTechnology(tlist5);
    	
    	t1.setEmployees(list1);
    	t2.setEmployees(list2);
    	t3.setEmployees(list3);
    	t4.setEmployees(list4);
   
    	
    	Configuration con=new Configuration().configure();
    	//con.configure();
    	SessionFactory factory=con.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction txn=session.beginTransaction();
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.save(e4);
    	session.save(e5);
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);
    	
    	txn.commit();
    	
    	
    	
    	
    }
}
