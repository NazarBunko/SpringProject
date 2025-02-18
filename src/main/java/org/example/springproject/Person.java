package org.example.springproject;

public class Person {
    private Pet pet;

    Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
