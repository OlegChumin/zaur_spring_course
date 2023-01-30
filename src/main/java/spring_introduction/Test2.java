package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // creating Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet petCat = context.getBean("petCat", Pet.class); // used reflection
        petCat.say();

        Pet petDog = context.getBean("petDog", Pet.class); // used reflection
        petDog.say();

        Pet petDuck =  context.getBean("petDuck", Pet.class);
        petDuck.say();

        Pet petElephant = context.getBean("petElephant", Pet.class);
        petElephant.say();

        Pet petFrog = context.getBean("petFrog", Pet.class);
        petFrog.say();

        Pet petGiraffe = context.getBean("petGiraffe", Pet.class);
        petGiraffe.say();

        Pet petHorse = context.getBean("petHorse", Pet.class);
        petHorse.say();

    }
}
