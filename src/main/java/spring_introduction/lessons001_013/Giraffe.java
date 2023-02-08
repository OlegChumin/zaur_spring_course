package spring_introduction.lessons001_013;

public class Giraffe implements Pet{
    public Giraffe() {
        System.out.println("Giraffe bean is created");
    }

    @Override
    public void say() {
        System.out.println("Giraffe is silent");
    }
}
