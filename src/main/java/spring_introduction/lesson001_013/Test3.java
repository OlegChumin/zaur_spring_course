package spring_introduction.lesson001_013;

public class Test3 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();
    }
}
