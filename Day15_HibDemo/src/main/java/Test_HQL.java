//Currently not working 
//import java.awt.List;
//
//import org.hibernate.Session;
//
//import org.hibernate.query.Query;
//
//
//import com.util.HibUtil;
//
//
//
//public class Test_HQL {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Session session = HibUtil.getSessionFactory().getCurrentSession();
//		
//		session.beginTransaction();
//		
//		String hql="from Book bk";
//		
//		Query qry=session.createQuery(hql);
//		List<Book> list=qry.getResultList();
//		
//		for(bk:list) {
//			System.out.println(bk);
//		}
//		
//		session.getTransaction().commit();
//		session.close();
//	}
//
//}
