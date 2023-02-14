package for_lesson_018;

import org.springframework.stereotype.Component;
import spring_introduction.lessons001_013.Pet;

@Component("petDog")
public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }
}
