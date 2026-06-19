
package com.demo1;

import org.hibernate.*;

import com.util.HibUtil;

public class Test_Inheritance1 {
public static void main(String[] args) {
	Session session=HibUtil.getSessionFactory().getCurrentSession();
	Transaction trans=session.beginTransaction();
	
	//1:add emp 2:perEmp  3:tempEmp
	
	Employee emp=new Employee(101, "Anil", 34000);
	PerEmployee perEmp=new PerEmployee(102, "Sunil", 45000, "Mgr", "IT");
	TempEmployee tempEmp=new TempEmployee(103, "Nitin", 3000, 34, "Nishant");
	
	
	session.save(emp);
	System.out.println("Employee Inserted");
	
	session.save(perEmp);
	System.out.println("Per Employee Inserted");
	
	session.save(tempEmp);
	System.out.println("TempEmployee Inserted");
	
	trans.commit();
	session.close();
	
}
}