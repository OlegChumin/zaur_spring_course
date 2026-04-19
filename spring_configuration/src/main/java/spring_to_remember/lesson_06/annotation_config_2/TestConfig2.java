package spring_to_remember.lesson_06.annotation_config_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_06.annotation_config_2.config.MyAppConfig2;
import spring_to_remember.lesson_06.annotation_config_2.service.Person;

public class TestConfig2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyAppConfig2.class);
        Person person = context.getBean(Person.class);
        person.callPet();
        System.out.println(person);
        context.close();
    }
}
