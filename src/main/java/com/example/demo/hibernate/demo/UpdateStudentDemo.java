package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set lastName='Tarook' where lastName='Tarek'").executeUpdate();

			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





