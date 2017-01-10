package in.himtech.orm.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Bike;
import in.himtech.orm.domain.Car;
import in.himtech.orm.domain.Vehicle;
import in.himtech.orm.utils.HibernateUtils;

public class VehicleAction {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Vehicle vehicle = new Vehicle("Bicycle", "UP14CB2012");
		
		Bike bike = new Bike("Hero Honda", "UP14CB2014", "passonPro", "2");
		
		Car car = new Car("Maruti Ignish", "UP16ABCE", "5", "Maruti");
		
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
