package com.spring.Springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile() {
        System.out.println("Compilingg... in laptop");
    }
}
