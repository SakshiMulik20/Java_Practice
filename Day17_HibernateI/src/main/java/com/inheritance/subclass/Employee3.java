
package com.inheritance.subclass;

import javax.persistence.*;



@Entity
@Table(name="seed_emp3")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee3 {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)//static
	private int empid;
	@Column
	private String name;
	@Column
	private double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee3(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Employee3() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}