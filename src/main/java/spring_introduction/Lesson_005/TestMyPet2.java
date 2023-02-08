package spring_introduction.Lesson_005;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Cat;
import spring_introduction.Dog;
import spring_introduction.Pet;

public class TestMyPet2 {
    public static void main(String[] args) {
        Pet pet =  new Dog();
        PetOwner petOwner = new PetOwner(pet);
        petOwner.callMyPet();
    }
}
