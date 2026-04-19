package spring_to_remember.lesson_08.aop_around.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring_to_remember.lesson_08.aop_around")
@EnableAspectJAutoProxy
public class MyConfig {
}
