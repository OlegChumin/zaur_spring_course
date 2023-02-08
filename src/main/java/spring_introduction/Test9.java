package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml", "applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
//        Pet myDog = (Dog) context.getBean("petDog", Pet.class);
        Dog myDog = context.getBean("petDog", Dog.class);
        Dog newDog = context.getBean("petDog", Dog.class);
        System.out.println("myDog == newDog : " + (myDog == newDog));
        System.out.println("myDog = " + myDog);
        System.out.println("newDog = " + newDog);
        System.out.println("----------------------------------------");
    }
}
