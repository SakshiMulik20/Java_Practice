
package com.demo1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "perEmp")
public class PerEmployee extends Employee {
	
	@Column
	private String desg;
	@Column
	private String dept;

	public PerEmployee(int empid, String name, double salary, String desg, String dept) {
		super(empid, name, salary);
		this.desg = desg;
		this.dept = dept;
	}

	public PerEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "PerEmployee [desg=" + desg + ", dept=" + dept + "]";
	}
	
	

}