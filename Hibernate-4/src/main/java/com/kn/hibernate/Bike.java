package com.kn.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	int regNumber;
	String mode;
	double cost;
	public Bike(int regNumber, String mode, double cost) {
		super();
		this.regNumber = regNumber;
		this.mode = mode;
		this.cost = cost;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", mode=" + mode + ", cost=" + cost + "]";
	}

}
