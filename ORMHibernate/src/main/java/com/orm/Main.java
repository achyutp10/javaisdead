// Add data

//package com.orm;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Achyut3");
//        s1.setRollNo(106);
//        s1.setsAge(25);
//
//
////        Configuration cfg = new Configuration();
////        cfg.addAnnotatedClass(com.orm.Student.class);
////        cfg.configure();
////        SessionFactory sf = cfg.buildSessionFactory();
//
//        SessionFactory sf = new Configuration().
//                addAnnotatedClass(com.orm.Student.class)
//                .configure().
//                buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();
//        session.close();
//        sf.close();
//        System.out.println(s1);
//
//    }
//}
//
//// fetch data
//package com.orm;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Achyut3");
//        s1.setRollNo(106);
//        s1.setsAge(25);
//
//        Student s2 = null;
//
////        Configuration cfg = new Configuration();
////        cfg.addAnnotatedClass(com.orm.Student.class);
////        cfg.configure();
////        SessionFactory sf = cfg.buildSessionFactory();
//
//        SessionFactory sf = new Configuration().
//                addAnnotatedClass(com.orm.Student.class)
//                .configure().
//                buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        s2 = session.find(Student.class,102);
////        s2 = session.load(Student.class, 102);
//
//        session.close();
//        sf.close();
//        System.out.println(s2);
//
//    }
//}
//
//
//// Update data
//package com.orm;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Abisha");
//        s1.setRollNo(102);
//        s1.setsAge(23);
//
//        SessionFactory sf = new Configuration().
//                addAnnotatedClass(com.orm.Student.class)
//                .configure().
//                buildSessionFactory();
//
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();
//
//        session.close();
//        sf.close();
//        System.out.println(s1);
//
//    }
//}



// Delete data
//package com.orm;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
////        s1.setsName("Abisha");
////        s1.setRollNo(102);
////        s1.setsAge(23);
//
//        SessionFactory sf = new Configuration().
//                addAnnotatedClass(com.orm.Student.class)
//                .configure().
//                buildSessionFactory();
//
//        Session session = sf.openSession();
//        s1 = session.find(Student.class, 106);
//        Transaction transaction = session.beginTransaction();
//
//        session.remove(s1);
//        transaction.commit();
//
//        session.close();
//        sf.close();
//        System.out.println(s1);
//
//    }
//}


// Working with alien class
package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setaName("Achyut");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration().
                addAnnotatedClass(com.orm.Alien.class)
                .configure().
                buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.find(Alien.class,101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
}