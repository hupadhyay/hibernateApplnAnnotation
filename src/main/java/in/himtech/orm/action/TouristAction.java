package in.himtech.orm.action;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Tourist;
import in.himtech.orm.utils.HibernateUtils;

public class TouristAction {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();
		
//		Query query = session.createQuery("from Tourist where id = 3");
//		query.setHint("org.hibernate.cacheable", "true");

//		session.beginTransaction();
//
//		Tourist tourist = session.get(Tourist.class, 3);
//		
//		System.out.println(tourist);
//		
		session.getTransaction().commit();

		session.close();
//		
		//////////////////////
		
		Session session1 = factory.openSession();

		session1.beginTransaction();
		
//		Tourist tourist1 = session1.get(Tourist.class, 3);
//		System.out.println(tourist1);

		session1.getTransaction().commit();

		session1.close();
		HibernateUtils.shutdown();
	}

}
