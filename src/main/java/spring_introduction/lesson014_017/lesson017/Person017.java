package spring_introduction.lesson014_017.lesson017;
//DI by setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_introduction.lesson001_013.Pet;

@Component("person_017")
public class Person017 {
    //fields for Person3
    private String name;
    private String surName;
    private int age;

    //Pet
    @Autowired
    private Pet pet;

    public Person017() {
        System.out.println("Person017 bean been created");
    }

    //    @Autowired
//    public Person016(Pet pet) {
//        System.out.println("Person016 bean been created");
//        this.pet = pet;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person017: set name");
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person017: set surName");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person017: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person017: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
