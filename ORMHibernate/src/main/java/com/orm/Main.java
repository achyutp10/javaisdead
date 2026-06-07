package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Achyut3");
        s1.setRollNo(106);
        s1.setsAge(25);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.orm.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration().
                addAnnotatedClass(com.orm.Student.class)
                .configure().
                buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }
}