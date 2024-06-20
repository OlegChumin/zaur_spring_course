package _01_spring_introduction.lesson_020;

import org.springframework.stereotype.Component;

@Component("cat_020")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat meow Meow-meow");
    }
}
