package spring_to_remember.lesson_04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_to_remember.lesson_04.models.Cat;
import spring_to_remember.lesson_04.models.Dog;
import spring_to_remember.lesson_04.models.Pet;
import spring_to_remember.lesson_04.service.PetOwner;

public class Test_01 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.say();
//
//        Pet petDog = new Dog();
//        petDog.say();
//
//        Pet petCat = new Cat();
//        petCat.say();

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet petCat = context.getBean("petCat", Pet.class);
//        petCat.say();
//
//        Pet petDog = context.getBean("petDog", Pet.class);
//        petDog.say();

        //PetOwner petOwner = new PetOwner(petCat);

        PetOwner petOwner = context.getBean("petOwner", PetOwner.class);
        petOwner.callPet();
        context.close(); //!
    }
}
