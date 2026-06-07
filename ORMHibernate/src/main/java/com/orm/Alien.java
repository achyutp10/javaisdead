//package com.orm;
//
//import jakarta.persistence.*;
//
//@Entity
////@Entity(name = "alien_table")
//@Table(name = "alien_table")
//public class Alien {
//    @Id
//    private int aid;
//    @Column(name = "alien_name")
//    private String aName;
//
//    @Transient // this will not save in database
//    private String tech;
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getaName() {
//        return aName;
//    }
//
//    public void setaName(String aName) {
//        this.aName = aName;
//    }
//
//    public String getTech() {
//        return tech;
//    }
//
//    public void setTech(String tech) {
//        this.tech = tech;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "aid=" + aid +
//                ", aName='" + aName + '\'' +
//                ", tech='" + tech + '\'' +
//                '}';
//    }
//}

package com.orm;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
//@Entity(name = "alien_table")
public class Alien {
    @Id
    private int aid;
    private String aName;
    private String tech;
//    @OneToOne
//    private Laptop laptop;
//
//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops;


    @ManyToMany
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}

