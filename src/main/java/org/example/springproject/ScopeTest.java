package org.example.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println(dog == dog2);
        context.close();
    }
}
