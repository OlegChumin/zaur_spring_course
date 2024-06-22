package aop_029_combine_pointcut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop_029_combine_pointcut")
@EnableAspectJAutoProxy // аннотация построения автоматического АОП PROXY Spring
public class MyConfig {
}
