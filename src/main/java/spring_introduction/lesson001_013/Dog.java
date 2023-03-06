package spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component("petDog")
public class Dog implements Pet{
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
