package spring_introduction.lessons001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
        Dog2 myDog = context.getBean("petDog2", Dog2.class);
        myDog.say();
        Dog2 newDog = context.getBean("petDog2", Dog2.class);
        newDog.say(); //singleton
        System.out.println("Context is closing");
        context.close();
    }
}
