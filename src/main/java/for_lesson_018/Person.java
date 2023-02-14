package for_lesson_018;
//DI by setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_introduction.lessons001_013.Pet;

@Component
public class Person {
    private String name;
    private String surName;
    private int age;

    //Pet
    @Autowired
    private Pet pet;

    public Person() {
        System.out.println("Person bean been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
