
import org.hibernate.Session;

import com.pojo.Address;
import com.pojo.Employee;
import com.util.HibUtil;

public class Tester_Component {

	public static void main(String[] args) {


		Session session=HibUtil.getSessionFactory().getCurrentSession();
		
		
		Address add1=new Address("Pune", "MH", "IND");
		
		Employee emp1=new Employee(1, "Anil", add1);
		
		
		session.beginTransaction();
		session.save(emp1);
		session.getTransaction().commit();		
		session.close();
		System.out.println("----insrted------");
		
		
		
		
		
		
		
		

	}

}