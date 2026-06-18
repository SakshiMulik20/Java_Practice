import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Book;

public class Test_Hib {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		
		System.out.println("--sonfig file get load---");
		
		SessionFactory sf=config.buildSessionFactory();
		System.out.println("--sf created--");
		
		Session session =sf.getCurrentSession();
		
		Transaction trans = session.beginTransaction();
		
		Book bk = new Book(1 , "Second" ,"james" , 500);
		session.save(bk);
		System.out.println("Inserted:");
		
		trans.commit();
		session.close();
		
	}

}
