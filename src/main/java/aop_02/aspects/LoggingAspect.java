package aop_02.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // аннотация для Spring, что это класс аспектов (методов скозной логики для проекта)
public class LoggingAspect {

    // I
//    @Before("execution(public void getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
//    }

    // II
//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice() {
//        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
//    }

    //III
//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice() {
//        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
//    }

    //IV любое количество параметров
    @Before("execution(public void *(..))")
    public void beforeGetBookAdvice() {
        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
    }
}
