package spring_introduction;
//DI by setter

public class Person2 {
    private Pet pet;

    public Person2() {
        System.out.println("Person2 bean been created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person2: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
