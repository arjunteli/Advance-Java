package com.kn.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int studentId;

	@Override
	public String toString() {
		return "Student [stuedntId=" + studentId + ", name=" + name + ", marks=" + marks + ", bike=" + bike + "]";
	}

	public int getStuedntId() {
		return studentId;
	}

	public void setStuedntId(int stuedntId) {
		this.studentId = stuedntId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Student() {
		super();
	}

	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	String name;
	int marks;

	@OneToOne
	Bike bike;
}
