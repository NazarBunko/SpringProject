package org.example.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Pet pet = context.getBean("MyPet", Pet.class);
        pet.say();

        context.close();
    }
}
