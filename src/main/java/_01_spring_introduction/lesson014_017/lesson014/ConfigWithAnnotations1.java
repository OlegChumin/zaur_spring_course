package _01_spring_introduction.lesson014_017.lesson014;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import _01_spring_introduction.lesson001_013.Cat;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Cat myCat = context.getBean("petCat", Cat.class);
        myCat.say();
        context.close();
    }
}
