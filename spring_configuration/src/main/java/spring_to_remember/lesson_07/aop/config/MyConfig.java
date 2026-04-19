package spring_to_remember.lesson_07.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring_to_remember.lesson_07.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
