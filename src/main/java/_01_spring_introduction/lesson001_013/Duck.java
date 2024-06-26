package _01_spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component("petDuck")
public class Duck implements Pet{
    public Duck() {
        System.out.println("Duck bean is created");
    }

    @Override
    public void say() {
        System.out.println("Duck quacks");
    }
}
