package spring_to_remember.lesson_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_04.models.Dog;

/**
 * Вариант создания бинов когда scope = prototype в applicationContext2.xml
 */
public class Test_05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("petDog", Dog.class);
        Dog myDog2 = context.getBean("petDog", Dog.class);
        Dog newDog = context.getBean("petDog", Dog.class);
//        System.out.println("myDog == newDog" + " " + /(myDog == newDog));
//
        context.close();
    }
}
