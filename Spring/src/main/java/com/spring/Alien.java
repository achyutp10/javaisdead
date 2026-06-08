//package com.spring;
//
//import java.beans.ConstructorProperties;
//
//public class Alien {
//    private Computer com;
//    private int age;
//    public Alien() {
////        System.out.println("object created");
//    }
//
//
////    public Alien(int age) {
////        System.out.println("para constructor called");
////        this.age = age;
////    }
//
////    @ConstructorProperties({"age","lap"})
////    public Alien(int age, Computer com) {
////        this.com = lap;
////        this.age = age;
////    }
//
//
//    public Computer getCom() {
//        return com;
//    }
//
//    public void setCom(Computer com) {
//        this.com = com;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
////        System.out.println("Setter called");
//        this.age = age;
//    }
//
////    public Laptop getLap() {
////        return lap;
////    }
//
////    public void setLap(Laptop lap) {
////        this.lap = lap;
////    }
//
//    public void code() {
//        System.out.println("Codingg...");
//        lap.compile();
//    }
//}

package com.spring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {    // Setter Injection
        //System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

}
