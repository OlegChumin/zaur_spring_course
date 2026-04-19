package spring_to_remember.lesson_06.annotation_config.config;

import org.springframework.context.annotation.*;
import spring_to_remember.lesson_06.annotation_config.models.Cat;
import spring_to_remember.lesson_06.annotation_config.models.Pet;
import spring_to_remember.lesson_06.annotation_config.service.Person;

@Configuration
@ComponentScan("spring_to_remember.lesson_06.annotation_config")
@PropertySource("classpath:myApp.properties")
public class MyAppConfig {
}
