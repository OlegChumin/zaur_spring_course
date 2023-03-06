package spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component("petCat")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat meow Meow-meow");
    }
}
