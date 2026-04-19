package spring_to_remember.lesson_06.annotation_config.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_06.annotation_config.service.Person;

public class TestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

//        Cat petCat = context.getBean("petCat", Cat.class);
//        Dog dog = context.getBean("dog", Dog.class);

//        petCat.say();
//        dog.say();

        Person person = context.getBean("person", Person.class);
        person.callPet();
        System.out.println(person);

        context.close();
    }
}
