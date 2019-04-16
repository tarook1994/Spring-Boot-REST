package com.example.demo.hibernate.demo;

import com.example.demo.hibernate.HeadHunt;
import com.example.demo.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CRUDDemo {

    public static void addUser(Session session) {
        HeadHunt user = new HeadHunt("Ahmed", "Mohamed", "Microsoft");
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }

    public static HeadHunt getUser(int id, Session session) {
        session.beginTransaction();
        HeadHunt user = (HeadHunt) session.get(HeadHunt.class, id);
        session.getTransaction().commit();
        return user;

    }

//    public static List<HeadHunt> getByCompany(String company, Session session) {
//
//    }

    public static void deleteUser(int id, Session session) {

    }


    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(HeadHunt.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        //add user
        addUser(session);
        session = factory.getCurrentSession();
        System.out.println(getUser(2, session));


    }
}
