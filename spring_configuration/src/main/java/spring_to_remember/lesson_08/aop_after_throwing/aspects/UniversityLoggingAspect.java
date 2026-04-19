package spring_to_remember.lesson_08.aop_after_throwing.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import spring_to_remember.lesson_08.aop_after_throwing.models.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов методом getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterReturningGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
    }

}
