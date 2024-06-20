package _01_spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component
public class Elephant implements Pet{
    public Elephant() {
        System.out.println("Elephant bean is created");
    }

    @Override
    public void say() {
        System.out.println("Elephant blows it's trunk");
    }
}
