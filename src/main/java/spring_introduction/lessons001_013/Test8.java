package spring_introduction.lessons001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Person3 olegPerson = context.getBean("personOleg", Person3.class);
        System.out.println("personOleg : " + olegPerson.getName() + " " + olegPerson.getSurName() + " " + olegPerson.getAge());
        olegPerson.callYourPet();
        context.close();
    }
}
