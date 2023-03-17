package aop_35_Advice_Around_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test_AOP_AroundAdvice {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);
        context.close();
    }
}
