package spring_to_remember.lesson_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_04.service.PetOwnerSetter;

public class Test_2 {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContextSetter.xml", "applicationContext.xml");
                     new ClassPathXmlApplicationContext("applicationContextSetter.xml")) {

            PetOwnerSetter petOwnerSetter = context.getBean("petOwnerSetter", PetOwnerSetter.class);
            petOwnerSetter.callPet();
        }

        //context.close();
    }
}
