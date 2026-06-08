package com.spring.Springboot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public void compile() {
        System.out.println("Compilingg... in Desktop");
    }
}
