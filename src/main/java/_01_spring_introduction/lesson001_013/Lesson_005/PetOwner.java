package _01_spring_introduction.lesson001_013.Lesson_005;

import _01_spring_introduction.lesson001_013.Pet;

public class PetOwner {
    private Pet pet;

    public PetOwner(Pet pet) {
        this.pet = pet;
    }

    public void callMyPet() {
        System.out.println("Hi, my pet");
        pet.say();
    }
}
