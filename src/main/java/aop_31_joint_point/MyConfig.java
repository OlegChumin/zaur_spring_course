package aop_31_joint_point;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("aop_31_joint_point")
@EnableAspectJAutoProxy
public class MyConfig {
}
