package _01_spring_introduction.lesson014_017.lesson016;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Person016 person016 = context.getBean("person_016", Person016.class);
        person016.callYourPet();
        context.close();
    }
}
