package spring_introduction.lessons001_013.Lesson_005;

import spring_introduction.lessons001_013.Pet;

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
