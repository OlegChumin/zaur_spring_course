package spring_introduction.lessons001_013.Lesson_005;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.lessons001_013.Pet;

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
