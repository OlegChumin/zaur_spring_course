package _01_spring_introduction.lesson_022.config.models;

//@Component("cat_022")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat meow Meow-meow");
    }
}
