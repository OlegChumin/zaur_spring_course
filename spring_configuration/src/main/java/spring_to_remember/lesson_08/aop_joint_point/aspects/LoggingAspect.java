package spring_to_remember.lesson_08.aop_joint_point.aspects;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_to_remember.lesson_08.aop_joint_point.models.Book;

@Component
@Aspect
@Order(20)
public class LoggingAspect {

    @Before("spring_to_remember.lesson_08.aop_joint_point.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature(); // рефлексия
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethod(): " + methodSignature.getName());


        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object element : arguments) {
                if(element instanceof Book) {
                    Book book = (Book) element;
                    System.out.println("Информация о книге - название: " +
                            book.getName() + " автор " + book.getAuthor() + " год издания - " +
                            book.getYearOfPublishing());
                } else if (element instanceof String) {
                    System.out.println(" книгу в библиотеку добавляет  " + element);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование попытки получения...");
        System.out.println("---------------------------------------------------------");
    }
}
