package _01_spring_introduction.lesson014_017.lesson014;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import _01_spring_introduction.lesson001_013.Elephant;
import _01_spring_introduction.lesson001_013.Frog;

public class ConfigWithAnnotations2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext014.xml");
        Elephant myElephant = context.getBean("elephant", Elephant.class);
        myElephant.say();
        Frog myFrog = context.getBean("frog", Frog.class);
        myFrog.say();
        context.close();
    }
}
