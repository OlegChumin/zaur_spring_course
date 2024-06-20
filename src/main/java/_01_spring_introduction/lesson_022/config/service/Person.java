package _01_spring_introduction.lesson_022.config.service;

import _01_spring_introduction.lesson_020.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person_022")
public class Person {

    @Value("John")
    private String name;

    @Value("Wick")
    private String surName;

    @Value("50")
    private int age;

    //    @Autowired
//    @Qualifier("dog_018")
//    @Qualifier("cat_018")
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person been is created");
        this.pet = pet;
    }

    //    @Autowired
//    public Person(@Qualifier("dog_021") Pet pet) { //Qualifier added in param as scope of @Qualifier annotation not in constructor
//        this.pet = pet;
//    }

//    @Autowired
//    @Qualifier("dog_019")
//    @Qualifier("cat_019")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }


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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}