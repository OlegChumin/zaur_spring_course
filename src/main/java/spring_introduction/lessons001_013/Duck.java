package spring_introduction.lessons001_013;

public class Duck implements Pet{
    public Duck() {
        System.out.println("Duck bean is created");
    }

    @Override
    public void say() {
        System.out.println("Duck quacks");
    }
}
