package aop_30_order.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop_30_order.aspects.MyPointcuts.allGetMethods()") //аннотация выполнения Aspect логгирования до выполнение метода из UniLibrary
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvic: логированние попытки получить книгу/журнал");
    }
}
