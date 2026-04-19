package spring_to_remember.lesson_08.aop_around.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniLibraryLoggingAspect {

    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("aroundReturnBookLoggingAdvice: возвращаем книгу в библиотеку ");
        Object targetMethodResult =  null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение "  + e);
            targetMethodResult = "Неизвестное название книги";
            //throw new RuntimeException(e);
        }

        System.out.println("aroundReturnBookLoggingAdvice: книгу вернули в библиотеку ");
        return targetMethodResult;
    }

}
