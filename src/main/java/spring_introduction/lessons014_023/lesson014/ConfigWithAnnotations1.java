package spring_introduction.lessons014_023.lesson014;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.lessons001_013.Cat;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Cat myCat = context.getBean("petCat", Cat.class);
        myCat.say();
        context.close();
    }
}
