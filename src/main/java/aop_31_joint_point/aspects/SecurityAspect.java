package aop_31_joint_point.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop_31_joint_point.MyPointcuts.allGetMethods()") //аннотация выполнения Aspect проверки безопасности до выполнение метода из UniLibrary
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }
}
