package spring_introduction.lessons001_013;

import org.springframework.stereotype.Component;

@Component
public class Dog2 implements Pet{
    public Dog2() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }

    public void init() {
        System.out.println("Class Dog2: init method");
    }

    public void destroy() {
        System.out.println("Class Dog2: destroy method");
    }
}
