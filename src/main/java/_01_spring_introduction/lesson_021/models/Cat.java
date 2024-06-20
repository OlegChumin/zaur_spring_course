package _01_spring_introduction.lesson_021.models;

import _01_spring_introduction.lesson_020.Pet;
import org.springframework.stereotype.Component;

@Component("cat_021")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat meow Meow-meow");
    }
}
