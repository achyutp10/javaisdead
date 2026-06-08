package com.spring.Springboot.repo;

import com.spring.Springboot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in database.");
    }
}
