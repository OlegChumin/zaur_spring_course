package _01_spring_introduction.lesson_019;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_019 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext019.xml");
        Person person = context.getBean("person_019", Person.class);

        person.callYourPet();
        System.out.println(person);

        context.close();
    }
}
