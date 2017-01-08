package in.himtech.orm.action;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Person;
import in.himtech.orm.domain.PersonId;
import in.himtech.orm.utils.HibernateUtils;

public class PersonAction {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		PersonId pId = new PersonId();
		pId.setFirstName("Abc");
		pId.setLocalityName("Sector 62");
		
		Person person = new Person();
		person.setName("Sohan");
		person.setDob(new Date());
		person.setCity("Noida");
		person.setId(pId);
		
		session.save(person);
		
		System.out.println("--------------------------------------------------");
		
		Person usr = session.get(Person.class, pId);
		
		System.out.println(usr);
		
		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
