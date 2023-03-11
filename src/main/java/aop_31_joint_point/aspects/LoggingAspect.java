package aop_31_joint_point.aspects;

import aop_31_joint_point.Book;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop_31_joint_point.MyPointcuts.allAddMethods()")
    //аннотация выполнения Aspect логгирования до выполнение метода из UniLibrary
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature..getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object element: arguments) {
                if(element instanceof Book) {
                    Book myBook = (Book) element;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + " автор - " + myBook.getAuthor() + " год издания - " +
                            myBook.getYearOfPublication());
                } else if (element instanceof String) {
                    System.out.println("книгу вбиблиотек добававляет " + element);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логированние попытки получить книгу/журнал");
        System.out.println("----------------------------");
    }
}
