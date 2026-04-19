package spring_to_remember.lesson_08.aop_joint_point.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionAspect {
    @Before("spring_to_remember.lesson_08.aop_joint_point.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionAdvice() {
        System.out.println("beforeGetExceptionAdvice: логирование ошибок или исключений...");
    }
}
