package in.himtech.orm.action;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import in.himtech.orm.domain.Book;
import in.himtech.orm.domain.Chapter;
import in.himtech.orm.utils.HibernateUtils;

public class BookAction {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Chapter ch1 = new Chapter();
		ch1.setName("Introduction");
		ch1.setNumber(1);
		ch1.setContent("english conent");
		
		Chapter ch2 = new Chapter();
		ch2.setName("Basic");
		ch2.setNumber(2);
		ch2.setContent("english conent");
		
		Book book = new Book();
		
		book.setAuthor("MyAuthor");
		book.setName("MyBook");
		book.setPublishDate(new Date());
		book.getChapters().add(ch1);
		book.getChapters().add(ch2);
		
		session.save(book);
		
		System.out.println("--------------------------------------------------");
		
//		Person usr = session.get(Person.class, pId);
//		
//		System.out.println(usr);
		
		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtils.shutdown();
	}

}
