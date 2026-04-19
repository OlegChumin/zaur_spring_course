package spring_to_remember.lesson_06.annotation_config_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring_to_remember.lesson_06.annotation_config_2.models.Pet;

public class Person {

    @Value("${personWick.name}")
    private String name;

    @Value("${personWick.surname}")
    private String surName;

    @Value("${personWick.age}")
    private int age;

    //@Autowired
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    public Person(@Qualifier("petCat") Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public Pet getPet() {
        return pet;
    }

//    @Autowired
//    @Qualifier("petCat")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hallo my Pet!");
        pet.say();
    }

    public void init() {
        // open resources
        System.out.println("Person bean is going through init");
    }


    public void destroy() {
        // close resources
        System.out.println("Person bean will bew destroy now");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
