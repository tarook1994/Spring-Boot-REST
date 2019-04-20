package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.InstructiorDetail;
import com.example.demo.hibernate.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDemo {

    public static void main(String [] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructiorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        Instructor instructor = new Instructor("mamado","tarek","mamado@hotmail.com");

        InstructiorDetail instructiorDetail = new InstructiorDetail("Youtube_Aci","guitar");

        instructor.setInstructorDetail(instructiorDetail);


        try {

            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();;

        } finally {
            factory.close();

        }
    }
}
