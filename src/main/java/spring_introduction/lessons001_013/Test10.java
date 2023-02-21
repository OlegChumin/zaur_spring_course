package spring_introduction.lessons001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
        Pet petDog2 = context.getBean("petDog2", Dog2.class);
        petDog2.say();
        context.close();
        // here will be called method destroyed!
        // intit destroy void - поскольку можно что-то возвращать но использовать это нельзя
    }
}
