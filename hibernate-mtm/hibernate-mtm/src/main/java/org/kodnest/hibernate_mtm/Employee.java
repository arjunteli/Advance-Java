package org.kodnest.hibernate_mtm;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int empId;
	String ename;
	char Team;
	
	
	@ManyToMany
	List<Technology> technology;


	public Employee() {
		super();
	}


	public Employee(int empId, String ename, char team) {
		super();
		this.empId = empId;
		this.ename = ename;
		Team = team;
	}
	


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public char getTeam() {
		return Team;
	}


	public void setTeam(char team) {
		Team = team;
	}


	public List<Technology> getTechnology() {
		return technology;
	}


	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", Team=" + Team + ", technology=" + technology + "]";
	}
	
	

}
