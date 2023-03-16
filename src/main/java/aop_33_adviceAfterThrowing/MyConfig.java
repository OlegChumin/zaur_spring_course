package aop_33_adviceAfterThrowing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop_33_adviceAfterThrowing")
@EnableAspectJAutoProxy
public class MyConfig {
}
