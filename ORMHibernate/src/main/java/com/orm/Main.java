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

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Macbook");
        l2.setModel("pro");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Macbook");
        l3.setModel("Air");
        l3.setRam(8);


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setaName("Achyut");
        a1.setTech("Java");
        a1.setLaptops(Arrays.asList(l1,l2));


        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setaName("Navin");
        a2.setTech("Java Core");


//        Alien a3 = new Alien();
//        a3.setAid(103);
//        a3.setaName("Hari");
//        a3.setTech("Dot net");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));
//        a3.setLaptops(Arrays.asList(l3));



//        l1.setAlien(Arrays.asList(a1,a3));
//        l2.setAlien(Arrays.asList(a1,a2));
//        l3.setAlien(Arrays.asList(a1));


        SessionFactory sf = new Configuration().
                addAnnotatedClass(com.orm.Alien.class)
                .addAnnotatedClasses(com.orm.Laptop.class)
                .configure().
                buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
//        session.persist(a3);

        transaction.commit();

//        Alien a5 = session.find(Alien.class,101);
//        System.out.println(a5);

        session.close();
        Session session1 = sf.openSession();
        Alien a5 = session1.find(Alien.class,101);
//        System.out.println(a5);
        session1.close();

        sf.close();

    }
}