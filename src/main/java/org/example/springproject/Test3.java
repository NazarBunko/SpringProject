package org.example.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Person person = (Person) context.getBean("myPerson");
        person.callYourPet();
        System.out.println(person.getSurname() + " is " + person.getAge() + " years old");

        context.close();
    }
}
