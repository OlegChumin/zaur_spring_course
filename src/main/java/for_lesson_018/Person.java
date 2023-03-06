package for_lesson_018;
//DI by setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person_018")
public class Person {
    private String name;
    private String surName;
    private int age;

    //    @Autowired
//    @Qualifier("dog_018")
//    @Qualifier("cat_018")
    private Pet pet;

    @Autowired
    public Person(@Qualifier("dog_018") Pet pet) { //Qualifier added in param as scope of @Qualifier annotation not in constructor
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dog_018")
//    @Qualifier("cat_018")
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

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
