package spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component("pet")
public class Giraffe implements Pet{
    public Giraffe() {
        System.out.println("Giraffe bean is created");
    }

    @Override
    public void say() {
        System.out.println("Giraffe is silent");
    }
}
