package spring_introduction.lessons014_023.lesson017;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.lessons014_023.lesson016.Person016;

public class ConfigWithAnnotations6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Person017 person017 = context.getBean("person_017", Person017.class);
        person017.callYourPet();
        context.close();
    }
}
