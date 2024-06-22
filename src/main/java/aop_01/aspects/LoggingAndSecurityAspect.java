package aop_01.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // аннотация для Spring, что это класс аспектов (методов скозной логики для проекта)
public class LoggingAndSecurityAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
//    @Pointcut("execution(* get*())") // Pointcut - выражение в виде шаблона - метода на который ссылаются Аспекты ниже
//    //в данном случае аспекты выполняются для методов со всеми модификаторами доступа
//    // с любыми типами возвращаемых аргументов или void
//    // для всех методоа с get названии и без параметров
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()") //аннотация выполнения Aspect логгирования до выполнение метода из UniLibrary
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvic: логированние попытки получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()") //аннотация выполнения Aspect проверки безопасности до выполнение метода из UniLibrary
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }
}
