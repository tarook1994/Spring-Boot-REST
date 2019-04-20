package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.InstructiorDetail;
import com.example.demo.hibernate.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String [] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructiorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();




        try {

            session.beginTransaction();
            Instructor i = (Instructor) session.get(Instructor.class,1);
            if(i!=null) {
                session.delete(i);
                System.out.println("Deleting! ");
            }
            session.getTransaction().commit();


        } finally {
            factory.close();

        }
    }
}
