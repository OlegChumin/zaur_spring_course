package _01_spring_introduction.lesson_022.config;

import _01_spring_introduction.lesson_021.config.MyConfig;
import _01_spring_introduction.lesson_021.service.Person;
import _01_spring_introduction.lesson_022.config.config.ProjectConfig;
import _01_spring_introduction.lesson_022.config.models.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_022 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Pet cat  = context.getBean("catBean", Pet.class);
        cat.say();
        context.close();
    }
}
