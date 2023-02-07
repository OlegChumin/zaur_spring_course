package spring_introduction.Lesson_005;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Pet;

public class TestMyPet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext myPetContext = new ClassPathXmlApplicationContext("applicationContextPets.xml");
        Pet petCat = myPetContext.getBean("myCat", Pet.class);
        petCat.say();
        Pet petDog = myPetContext.getBean("myDog", Pet.class);
        petDog.say();

        myPetContext.close();
    }
}
