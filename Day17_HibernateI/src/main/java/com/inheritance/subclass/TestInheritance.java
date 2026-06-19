
package com.inheritance.subclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.subclass.pojo.*;
import com.util.HibUtil;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibUtil.getSessionFactory().getCurrentSession();
		Transaction trans=session.beginTransaction();
		
		
		Employee3 emp=new Employee3(301, "Abc", 90000);
		PerEmployee3 pEmp=new PerEmployee3(302, "Xyz", 80000, "Admin", "IT");
		TempEmployee3 tEmp=new TempEmployee3(303, "Ijk", 3000, 10, "Abc");
		
		
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