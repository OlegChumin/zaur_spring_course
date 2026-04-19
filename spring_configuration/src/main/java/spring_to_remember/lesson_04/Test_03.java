package spring_to_remember.lesson_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_04.service.Person;

public class Test_03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPerson.xml");

        Person person = context.getBean("personOlaf", Person.class);
        person.callPet();
        System.out.println(person);
        context.close();
    }
}
