package spring_introduction;

public class Duck implements Pet{
    @Override
    public void say() {
        System.out.println("Duck quacks");
    }
}
