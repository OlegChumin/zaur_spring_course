package spring_to_remember.lesson_06.annotation_config_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import spring_to_remember.lesson_06.annotation_config_2.models.Cat;
import spring_to_remember.lesson_06.annotation_config_2.models.Pet;
import spring_to_remember.lesson_06.annotation_config_2.service.Person;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyAppConfig2 {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
