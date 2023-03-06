package spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component
public class Frog implements Pet{
    public Frog() {
        System.out.println("Frog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Frog croaks");
    }
}
