package spring_introduction.lesson001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person3 person = context.getBean("personOleg", Person3.class);
        person.callYourPet();
        System.out.println(person.getName() + " " + person.getSurName() + " " + person.getAge());
        context.close();
    }
}
