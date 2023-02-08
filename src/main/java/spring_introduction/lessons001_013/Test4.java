package spring_introduction.lessons001_013;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("petCat", Pet.class);

        Person person = new Person(pet); // hard code dependency
        person.callYourPet();

        context.close(); //! to close
    }
}
