package aop_31_joint_point.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop_31_joint_point.MyPointcuts.allAddMethods()") //аннотация выполнения Aspect логгирования до выполнение метода из UniLibrary
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvic: логированние попытки получить книгу/журнал");
        System.out.println("----------------------------");
    }
}
