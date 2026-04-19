package spring_to_remember.lesson_04.service;

import spring_to_remember.lesson_04.models.Pet;

public class PetOwner {
    private Pet pet;

    public PetOwner(Pet pet) {
        System.out.println("PetOwner bean is created");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hallo my Pet!");
        pet.say();
    }
}
