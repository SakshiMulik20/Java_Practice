


import org.hibernate.Session;

import com.pojo.EmployeeDetails;
import com.pojo.MyEmployee;
import com.util.HibUtil;

public class TestOneToOne {

	public static void main(String[] args) {

		Session session = HibUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		// to store employee
		MyEmployee emp1 = new MyEmployee(102,"Anil", 90000);

		EmployeeDetails empDetails1 = new EmployeeDetails("Pune11", "Maha", "xyz@gmail.com");

		empDetails1.setEmp(emp1);

		session.save(emp1);
		
		session.save(empDetails1); 

		System.out.println("---inserted------");

		session.getTransaction().commit();
		session.close();

	}

}