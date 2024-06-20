package _01_spring_introduction.lesson001_013;

import org.springframework.stereotype.Component;

@Component
public class Dog2 implements Pet{
    public Dog2() {
        System.out.println("Dog2 bean is created");
    }

    @Override
    public void say() {
        System.out.println("Dog2 is barking Bow-wow");
    }

    public void init() {
        System.out.println("Class Dog2: init method");
    }

    public void destroy() {
        System.out.println("Class Dog2: destroy method");
    }
}
