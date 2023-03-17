package aop_35_Advice_Around_1.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(String returnBook())")
    public void aroundReturnBookLoggingAdvice() {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку возвращают книгу");
    }
}
