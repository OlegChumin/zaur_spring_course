package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");

        context.close();
    }
}
