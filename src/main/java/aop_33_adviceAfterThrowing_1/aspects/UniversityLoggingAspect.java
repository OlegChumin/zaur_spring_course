package aop_33_adviceAfterThrowing_1.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед " +
                "методом getStudents");
    }

    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingGetStudentsLoggingAdvice() {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логгируем выброс исключения");
    }
}
