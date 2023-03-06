package spring_introduction.lesson014_017.lesson015;
//DI by setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_introduction.lesson001_013.Pet;

@Component("person_015")
public class Person015 {
    //fields for Person3
    private String name;
    private String surName;
    private int age;

    //Pet
    private Pet pet;


    @Autowired
    public Person015(Pet pet) {
        System.out.println("Person015 bean been created");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person3: set name");
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person3: set surName");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person3: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person3: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
