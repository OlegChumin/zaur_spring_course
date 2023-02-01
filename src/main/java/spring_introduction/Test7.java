package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Person3 person = context.getBean("somePerson", Person3.class);
        person.callYourPet();
        System.out.println(person.getName() + " " + person.getSurName() + " " + person.getAge());

        Person3 person50 = context.getBean("somePerson50", Person3.class); //!singleton
        person.callYourPet();
        System.out.println(person.getName() + " " + person.getSurName() + " " + person.getAge());
        context.close();
    }
}
