package spring_to_remember.lesson_06.annotation_config_2.models;

import org.springframework.stereotype.Component;


public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Dog is barking Bow-wow");
    }
}
