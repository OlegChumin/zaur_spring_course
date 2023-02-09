package spring_introduction.lessons014_023.lesson016;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.lessons014_023.lesson015.Person015;

public class ConfigWithAnnotations5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Person015 person015 = context.getBean("person_015", Person015.class);
        person015.callYourPet();
        context.close();
    }
}
