package _01_spring_introduction.lesson001_013._013;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);

       // ((ClassPathXmlApplicationContext) context).close();  destroy не сработает
    }
}
