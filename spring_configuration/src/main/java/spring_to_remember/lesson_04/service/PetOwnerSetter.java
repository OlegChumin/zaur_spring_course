package spring_to_remember.lesson_04.service;

import spring_to_remember.lesson_04.models.Pet;

public class PetOwnerSetter {
    private Pet pet;

    public PetOwnerSetter() {
        System.out.println("PetOwner bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class PetOwner: set pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hallo my Pet!");
        pet.say();
    }

}
