package _01_spring_introduction.lesson_020;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_020 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext020.xml");
        Person person = context.getBean("person_020", Person.class);

        person.callYourPet();
        System.out.println(person);

        context.close();
    }
}
