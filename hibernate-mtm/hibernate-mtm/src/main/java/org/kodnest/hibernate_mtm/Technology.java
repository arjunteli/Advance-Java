package org.kodnest.hibernate_mtm;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int tech_id;
	String tech_name;
	
	@ManyToMany
	List<Employee> employees;

	public Technology() {
		super();
	}

	public Technology(int tech_id, String tech_name) {
		super();
		this.tech_id = tech_id;
		this.tech_name = tech_name;
	}

	public int getTech_id() {
		return tech_id;
	}

	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}

	public String getTech_name() {
		return tech_name;
	}

	public void setTech_name(String tech_name) {
		this.tech_name = tech_name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Technology [tech_id=" + tech_id + ", tech_name=" + tech_name + ", employees=" + employees + "]";
	}
	
	

}
