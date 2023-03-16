package aop_32_AdviceAfterReturning.aspects;

import aop_32_AdviceAfterReturning.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед " +
                "методом getStudents");
    }


    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после работы " +
                "метода getStudents");
        Student firstStudent = students.get(0);
        String surName = firstStudent.getSurName();
        surName = "Mr. " + surName;
        firstStudent.setSurName(surName); // меняем значение перед присвоением метода getStudents

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade++;
        firstStudent.setAvgGrade(avgGrade); // меняем значение перед присовением метода getStudents
    }
}
