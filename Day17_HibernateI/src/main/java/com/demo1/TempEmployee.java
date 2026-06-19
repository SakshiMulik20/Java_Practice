package com.demo1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "tempEmp")
public class TempEmployee extends Employee {

	@Column
	private int hrs;
	@Column
	private String ctrName;

	public TempEmployee(int empid, String name, double salary, int hrs, String ctrName) {
		super(empid, name, salary);
		this.hrs = hrs;
		this.ctrName = ctrName;
	}

	public TempEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "TempEmployee [hrs=" + hrs + ", ctrName=" + ctrName + "]";
	}
}
	
	