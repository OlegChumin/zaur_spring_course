package spring_introduction.lessons001_013;

public class Frog implements Pet{
    public Frog() {
        System.out.println("Frog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Frog croaks");
    }
}
