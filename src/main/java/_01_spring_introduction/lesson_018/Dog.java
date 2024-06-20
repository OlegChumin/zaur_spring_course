package _01_spring_introduction.lesson_018;

import org.springframework.stereotype.Component;

@Component("dog_018")
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
