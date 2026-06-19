
package com.inheritance.concrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="seed_perEmp")
@AttributeOverrides({
	@AttributeOverride(column = @Column(name="name_p"),name="name"),
	@AttributeOverride(column = @Column(name="salary_p"),name="salary")
})

public class PerEmployee2 extends Employee2 {
	
	@Column
	private String desg;
	@Column
	private String dept;

	public PerEmployee2(int empid, String name, double salary, String desg, String dept) {
		super(empid, name, salary);
		this.desg = desg;
		this.dept = dept;
	}

	public PerEmployee2() {
		super();
	}

	@Override
	public String toString() {
		return "PerEmployee [desg=" + desg + ", dept=" + dept + "]";
	}
	
	

}