package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person2 person = context.getBean("somePerson", Person2.class);
        person.callYourPet();
        context.close();
    }
}
