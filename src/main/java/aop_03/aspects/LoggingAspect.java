package aop_03.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // аннотация для Spring, что это класс аспектов (методов скозной логики для проекта)
public class LoggingAspect {

    // I
    @Before("execution(public void getBook(aop_03.models.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
    }

    // II
//    @Before("execution(public void getBook(aop_03.models.Book, ..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("BeforeGetBookAdvice: попытка получить книгу");
//    }
}
