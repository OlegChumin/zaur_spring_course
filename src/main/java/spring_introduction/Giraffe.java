package spring_introduction;

public class Giraffe implements Pet{
    public Giraffe() {
        System.out.println("Giraffe bean is created");
    }

    @Override
    public void say() {
        System.out.println("Giraffe is silent");
    }
}
