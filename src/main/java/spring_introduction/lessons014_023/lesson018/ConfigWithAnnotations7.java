package spring_introduction.lessons014_023.lesson018;

import for_lesson_018.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext018.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        context.close();
    }
}
