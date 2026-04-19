package spring_to_remember.lesson_08.aop_after_returning.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import spring_to_remember.lesson_08.aop_after_returning.models.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "studentList")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> studentList) {
        if (studentList != null && !studentList.isEmpty()) {
            Student firsStudent = studentList.get(0);
            String surName = firsStudent.getSurName();

            surName = "Mr. " + surName;

            firsStudent.setSurName(surName);

            double avrGrade = firsStudent.getAvrGrage();
            avrGrade++;
            firsStudent.setAvrGrage(avrGrade);

        }
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов");
    }

}
