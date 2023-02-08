package spring_introduction.Lesson_005;

import spring_introduction.Pet;

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
