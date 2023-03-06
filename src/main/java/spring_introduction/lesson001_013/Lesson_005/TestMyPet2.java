package spring_introduction.lesson001_013.Lesson_005;

import spring_introduction.lesson001_013.Dog;
import spring_introduction.lesson001_013.Pet;

public class TestMyPet2 {
    public static void main(String[] args) {
        Pet pet =  new Dog();
        PetOwner petOwner = new PetOwner(pet);
        petOwner.callMyPet();
    }
}
