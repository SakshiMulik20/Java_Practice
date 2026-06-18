package com.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mit_emp")
@Embeddable
public class Employee {

	@Id
	private int empid;
	@Column(name = "empname" ,length = 20)
	private String name;
	
	@Embedded
	private Address  address;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}