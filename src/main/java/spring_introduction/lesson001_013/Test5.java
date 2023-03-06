package spring_introduction.lesson001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("somePerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
