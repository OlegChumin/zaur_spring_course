package aop_35_Advice_Around_1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
        long timeStarts = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long timeEnds = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook выполнил работу за " +
                (timeEnds - timeStarts) + " миллисекунд");
        return targetMethodResult;
    }
}
