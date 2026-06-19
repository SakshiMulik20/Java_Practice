
package com.inheritance.concrete;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibUtil;

public class Tester_Concrete {
public static void main(String[] args) {
	
	Session session=HibUtil.getSessionFactory().getCurrentSession();
	Transaction trans=session.beginTransaction();
	
	
	Employee2 emp=new Employee2(301, "Abc", 90000);
	PerEmployee2 pEmp=new PerEmployee2(302, "Xyz", 80000, "Admin", "IT");
	TempEmployee2 tEmp=new TempEmployee2(303, "Ijk", 3000, 10, "Abc");
	
	
	session.save(emp);
	System.out.println("Emp Inserted");
	
	session.save(pEmp);
	System.out.println("pEmp Inserted");
	
	session.save(tEmp);
	System.out.println("temp inserted");
	
	
	trans.commit();
	session.close();
}
}