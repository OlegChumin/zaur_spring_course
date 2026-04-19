package spring_to_remember.lesson_06.annotation_config_2.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_06.annotation_config_2.service.Person;

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
