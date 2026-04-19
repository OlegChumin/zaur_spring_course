package spring_to_remember.lesson_06.annotation_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_06.annotation_config.config.MyAppConfig;
import spring_to_remember.lesson_06.annotation_config.service.Person;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyAppConfig.class);
        Person person = context.getBean(Person.class);
        person.callPet();
        System.out.println(person);
        context.close();
    }
}
