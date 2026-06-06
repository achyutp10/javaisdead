package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Achyut");
        s1.setRollNo(101);
        s1.setsAge(25);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.orm.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        System.out.println(s1);

    }
}