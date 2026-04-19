package spring_to_remember.lesson_07.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(public void get*(..))")
    private void allGetMethods() {}

    @Pointcut("execution(public void return*(..))")
    private void allReturnMethods() {}

    @Pointcut("allGetMethods() || allReturnMethods()")
    private void allGetAndReturnMethods() {}


    @Before("allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: логирование попытки получения книги");
    }

    @Before("allGetAndReturnMethods()")
    public void beforeGetAndReturnAdvice() {
        System.out.println("beforeGetAndReturnAdvice: логирование получения книги или возврата журнала");
    }

}
