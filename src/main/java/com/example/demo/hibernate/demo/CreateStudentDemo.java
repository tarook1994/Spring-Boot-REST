package com.example.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.hibernate.Student;

public class CreateStudentDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student s = new Student("Ahmed","Tarek","Ahmed@hotmail.com");
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();
			
			
		} finally {
			System.out.println("Finallyyy");
			factory.close();
		}
		
		
	}

}
