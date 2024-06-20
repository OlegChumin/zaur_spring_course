package _01_spring_introduction.lesson_019;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("person_019")
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.surName}")
    private String surName;

    @Value("${person.age}")
    private String ageString;

    private int age;

    //    @Autowired
//    @Qualifier("dog_018")
//    @Qualifier("cat_018")
    private Pet pet;

    @Autowired
    public Person(@Qualifier("dog_019") Pet pet) { //Qualifier added in param as scope of @Qualifier annotation not in constructor
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dog_019")
//    @Qualifier("cat_019")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    @PostConstruct
    public void init() {
        this.age = Integer.parseInt(ageString);
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