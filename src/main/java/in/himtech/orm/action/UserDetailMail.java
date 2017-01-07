package in.himtech.orm.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Address;
import in.himtech.orm.domain.UserDetail;
import in.himtech.orm.utils.HibernateUtils;

public class UserDetailMail {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		UserDetail user = new UserDetail();
		user.setName("Mohan");
		user.setDob(new Date());
		
		Address address = new Address();
		address.setLocality("Sector 62");
		address.setCity("Noida");
		address.setPincode("201301");
		
		Address address1 = new Address();
		address1.setLocality("Sector 63");
		address1.setCity("Gurgaon");
		address1.setPincode("101301");
		
		user.setAddress(address);
		user.setOfficeAddress(address1);
		
		session.save(user);
		
		System.out.println("--------------------------------------------------");
		
		UserDetail usr = session.get(UserDetail.class, 1l);
		
		System.out.println(usr);
		
		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
