package _01_spring_introduction.lesson_022.config.config;


import _01_spring_introduction.lesson_022.config.models.Cat;
import _01_spring_introduction.lesson_022.config.models.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }
}
