package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.Course;
import com.example.demo.hibernate.InstructiorDetail;
import com.example.demo.hibernate.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCoursesDemo {

    public static void main(String [] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructiorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();




        try {

            session.beginTransaction();

            Instructor instructor = (Instructor) session.get(Instructor.class, 2);

            Course tempCourse = new Course("Guitar");
            Course tempCourse2 = new Course("Hibernate");

            instructor.add(tempCourse);
            instructor.add(tempCourse2);

            session.save(tempCourse);
            session.save(tempCourse2);

            session.getTransaction().commit();;

        } finally {
            factory.close();

        }
    }
}
