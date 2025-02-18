package org.example.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Pet pet = (Pet) context.getBean("MyPet");
        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
