package spring_introduction.lessons001_013;

public class Elephant implements Pet{
    public Elephant() {
        System.out.println("Elephant bean is created");
    }

    @Override
    public void say() {
        System.out.println("Elephant blows it's trunk");
    }
}
