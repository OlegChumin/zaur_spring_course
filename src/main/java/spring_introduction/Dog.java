package spring_introduction;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }
}
