package spring_to_remember.lesson_06.init_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
