package _01_spring_introduction.lesson001_013;

public class Horse implements Pet{
    public Horse() {
        System.out.println("Horse bean is created");
    }

    @Override
    public void say() {
        System.out.println("Horse neighs");
    }
}
