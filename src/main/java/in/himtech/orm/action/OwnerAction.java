package in.himtech.orm.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Flat;
import in.himtech.orm.domain.Owner;
import in.himtech.orm.utils.HibernateUtils;

public class OwnerAction {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Owner owner= new Owner();
		owner.setName("Mukesh");
		owner.setBalance(2385934.45);
		
		
		Flat flat = new Flat();
		flat.setLocation("Noida");
		flat.setState("UP");
		flat.setOwner(owner);
		
		owner.setFlat(flat);
		
		session.save(owner);

		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
