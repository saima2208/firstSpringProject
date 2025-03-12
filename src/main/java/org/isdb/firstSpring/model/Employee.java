package org.isdb.firstSpring.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "employee_sb")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;

	private String email;
	private String address;
	private LocalDate startDate;

	public Employee() {

	}

	public Employee(int id, String name, String email, String address, LocalDate startDate) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
