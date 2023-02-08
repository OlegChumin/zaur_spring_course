package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
        Dog2 myDog = context.getBean("petDog", Dog2.class);
        myDog.say();
        System.out.println("Context is closing");
        context.close();
    }
}
