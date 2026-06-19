
package com.inheritance.subclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="seed_tempEmp3")
@PrimaryKeyJoinColumn(name="t_id")
public class TempEmployee3 extends Employee3 {

	@Column
	private int hrs;
	@Column
	private String ctrName;

	public TempEmployee3(int empid, String name, double salary, int hrs, String ctrName) {
		super(empid, name, salary);
		this.hrs = hrs;
		this.ctrName = ctrName;
	}

	public TempEmployee3() {
		super();
	}

	@Override
	public String toString() {
		return "TempEmployee [hrs=" + hrs + ", ctrName=" + ctrName + "]";
	}
	
	
}