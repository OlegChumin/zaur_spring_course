package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context8 =  new ClassPathXmlApplicationContext("applicationContext5.xml");
        Dog petDog = context8.getBean("petDog", Dog.class);
        petDog.say();
        Dog newDog = context8.getBean("petDog", Dog.class);
        newDog.say();
        System.out.println(petDog == newDog);
        System.out.println("petDog -> " + petDog);
        System.out.println("newDog -> " + newDog);

        petDog.setName("Belka");
        newDog.setName("Strelka");

        System.out.println(petDog == newDog);
        System.out.println(petDog.getName() + " -> " + petDog); //singleton os a default scope for beans for stateless objects
        System.out.println(newDog.getName() + " -> " + newDog);
        System.out.println();

        Cat petCat1 = context8.getBean("petCat", Cat.class);
        Cat petCat2 = context8.getBean("petCat", Cat.class);
        System.out.println("petCat2 == petCat2 : " + (petCat2 == petCat1));


        context8.close();
    }
}
