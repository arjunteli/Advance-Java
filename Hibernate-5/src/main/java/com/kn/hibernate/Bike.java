package com.kn.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {

	@Id
	int regNo;
	String bikeName;
	double price;

	@OneToOne
	Student student;

	public Bike(int regNo, String bikeName, double price) {
		this.regNo = regNo;
		this.bikeName = bikeName;
		this.price = price;
	}

	public Bike() {
		super();
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", bikeName=" + bikeName + ", price=" + price + ", student=" + student + "]";
	}

}
