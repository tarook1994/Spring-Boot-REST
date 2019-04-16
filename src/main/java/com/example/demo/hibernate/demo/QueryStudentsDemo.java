package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentsDemo {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            List<Student> students = session.createQuery("from Student s where s.lastName= 'test'").list();
            session.getTransaction().commit();
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }

        } finally {
            factory.close();
        }

    }
}
