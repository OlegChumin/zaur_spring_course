package spring_to_remember.lesson_04.models;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }
}
