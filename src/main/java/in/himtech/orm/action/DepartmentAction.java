package in.himtech.orm.action;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Department;
import in.himtech.orm.domain.Employee;
import in.himtech.orm.utils.HibernateUtils;

public class DepartmentAction {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setName("Mukesh");
		emp1.setDoj(new Date());
		
		Employee emp2 = new Employee();
		emp2.setName("Rakesh");
		emp2.setDoj(new Date());
		
		
		Employee emp3 = new Employee();
		emp3.setName("Suresh");
		emp3.setDoj(new Date());
		
		Department dept = new Department();
		dept.setName("Purchase");
		dept.getListEmp().add(emp1);
		dept.getListEmp().add(emp2);
		dept.getListEmp().add(emp3);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		emp3.setDept(dept);
		
		session.save(dept);

		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
