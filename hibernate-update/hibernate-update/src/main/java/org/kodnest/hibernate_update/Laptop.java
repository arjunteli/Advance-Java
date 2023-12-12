package org.kodnest.hibernate_update;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String laptopName;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(int laptopId, String laptopName, double cost) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.cost = cost;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", cost=" + cost + "]";
	}
	
	
}
