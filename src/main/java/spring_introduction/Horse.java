package spring_introduction;

public class Horse implements Pet{
    public Horse() {
        System.out.println("Horse bean is created");
    }

    @Override
    public void say() {
        System.out.println("Horse neighs");
    }
}
