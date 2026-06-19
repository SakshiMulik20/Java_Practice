
package com.inheritance.concrete;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="seed_tempEmp")
@AttributeOverrides({
	@AttributeOverride(column = @Column(name="name_t"),name="name"),
	@AttributeOverride(column = @Column(name="salary_t"),name="salary")
})
public class TempEmployee2 extends Employee2 {

	@Column
	private int hrs;
	@Column
	private String ctrName;

	public TempEmployee2(int empid, String name, double salary, int hrs, String ctrName) {
		super(empid, name, salary);
		this.hrs = hrs;
		this.ctrName = ctrName;
	}

	public TempEmployee2() {
		super();
	}

	@Override
	public String toString() {
		return "TempEmployee [hrs=" + hrs + ", ctrName=" + ctrName + "]";
	}
	
	
}
