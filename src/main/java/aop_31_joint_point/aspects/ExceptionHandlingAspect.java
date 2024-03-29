package aop_31_joint_point.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("aop_31_joint_point.MyPointcuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем исключения при попытке получить " +
                "книгу/журнал");
        System.out.println("----------------------------");
    }
}
