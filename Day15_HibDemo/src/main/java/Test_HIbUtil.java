import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Book;
import com.util.HibUtil;



public class Test_HIbUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		
		Session session=HibUtil.getSessionFactory().getCurrentSession();
		Transaction trans=session.beginTransaction();
		
		System.out.println("ENter id name author price ");
		
		Book bk1=new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		
		session.save(bk1);
		
		trans.commit();
		session.close();
		System.out.println("--saved--");
	}

}
