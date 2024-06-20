package _01_spring_introduction.lesson018;

import for_lesson_018.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleOfQualifierAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext018.xml");
        context.getBean("person_018", Person.class).callYourPet();
        context.close();
    }
}
