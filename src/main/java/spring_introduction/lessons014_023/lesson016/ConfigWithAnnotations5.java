package spring_introduction.lessons014_023.lesson016;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.lessons014_023.lesson015.Person015;

public class ConfigWithAnnotations5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Person016 person016 = context.getBean("person_016", Person016.class);
        person016.callYourPet();
        context.close();
    }
}
