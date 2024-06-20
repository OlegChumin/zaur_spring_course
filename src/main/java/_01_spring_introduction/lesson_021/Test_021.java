package _01_spring_introduction.lesson_021;

import _01_spring_introduction.lesson_021.config.MyConfig;
import _01_spring_introduction.lesson_021.service.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_021 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean(Person.class);
        person.callYourPet();
        System.out.println(person);
        context.close();
    }
}
