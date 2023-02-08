package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Dog myDog = context.getBean("petDog", Dog.class);
        myDog.setName("Belka");
        Dog newDog = context.getBean("petDog", Dog.class);
        newDog.setName("Strelka"); //singleton for stateless objects!

        System.out.println("myDog == newDog : " + (myDog == newDog));
        System.out.println("myDog = " + myDog.getName());
        System.out.println("newDog = " + newDog.getName());
        System.out.println("----------------------------------------");
    }
}
