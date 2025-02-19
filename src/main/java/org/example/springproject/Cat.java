package org.example.springproject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("cat")
//@Scope("prototype")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("I'm Cat");
    }
}
