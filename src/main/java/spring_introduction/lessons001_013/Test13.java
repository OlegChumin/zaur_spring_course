package spring_introduction.lessons001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test13 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
        Dog2 myDog = context.getBean("petDog2", Dog2.class);
        myDog.say();
        System.out.println("Context is closing");
        context.close(); //destroy method for prototype will not be called!
    }
}
