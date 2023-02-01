package spring_introduction;

public class Duck implements Pet{
    public Duck() {
        System.out.println("Duck bean is created");
    }

    @Override
    public void say() {
        System.out.println("Duck quacks");
    }
}
