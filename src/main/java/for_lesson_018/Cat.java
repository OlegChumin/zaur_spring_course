package for_lesson_018;

import org.springframework.stereotype.Component;
import spring_introduction.lessons001_013.Pet;

@Component("pet")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat meow Meow-meow");
    }
}
