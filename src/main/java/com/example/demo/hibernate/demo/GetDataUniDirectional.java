package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.InstructiorDetail;
import com.example.demo.hibernate.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDataUniDirectional {
    public static void main(String [] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructiorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();
            InstructiorDetail instructiorDetail = (InstructiorDetail) session.get(InstructiorDetail.class, 2);
            System.out.println(instructiorDetail.getInstructor());
            session.getTransaction().commit();

        } finally {
            factory.close();

        }
    }
}
