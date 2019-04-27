package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.Course;
import com.example.demo.hibernate.InstructiorDetail;
import com.example.demo.hibernate.Instructor;
import com.example.demo.hibernate.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseAndReviewDemo {

    public static void main(String [] args) {
        SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructiorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();




        try {

            session.beginTransaction();

            Course tempCourse = (Course) session.get(Course.class,10);
            Review r1 = new Review("LOVED THE COURSE");
            Review r2 = new Review("WOW!!");
            tempCourse.add(r1);
            tempCourse.add(r2);

            session.getTransaction().commit();

        } finally {
            factory.close();

        }
    }
}
