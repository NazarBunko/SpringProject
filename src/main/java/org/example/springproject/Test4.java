package org.example.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);

        /*dog.setName("Belka");
        dog2.setName("Strelka");
        System.out.println(dog.getName());
        System.out.println(dog2.getName());
        context.close();*/

    }
}
