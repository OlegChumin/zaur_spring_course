package aop_32_AdviceAfterReturning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop_32_AdviceAfterReturning")
@EnableAspectJAutoProxy
public class MyConfig {
}
