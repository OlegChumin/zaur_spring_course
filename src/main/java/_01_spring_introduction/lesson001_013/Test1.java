package _01_spring_introduction.lesson001_013;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.say();

        Pet petDog = new Dog();
        petDog.say();

        Pet petCat = new Cat();
        petCat.say();
    }
}
