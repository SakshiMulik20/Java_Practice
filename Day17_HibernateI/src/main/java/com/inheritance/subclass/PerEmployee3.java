
package com.inheritance.subclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="seed_perEmp3")
@PrimaryKeyJoinColumn(name="p_id")

public class PerEmployee3 extends Employee3 {
	
	@Column
	private String desg;
	@Column
	private String dept;

	public PerEmployee3(int empid, String name, double salary, String desg, String dept) {
		super(empid, name, salary);
		this.desg = desg;
		this.dept = dept;
	}

	public PerEmployee3() {
		super();
	}

	@Override
	public String toString() {
		return "PerEmployee [desg=" + desg + ", dept=" + dept + "]";
	}
	
	

}