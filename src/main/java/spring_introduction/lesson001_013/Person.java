package spring_introduction.lesson001_013;
//DI ny constructor

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean been created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
