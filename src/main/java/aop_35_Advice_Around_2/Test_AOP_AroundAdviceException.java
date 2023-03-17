package aop_35_Advice_Around_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_AOP_AroundAdviceException {
    public static void main(String[] args) {
        System.out.println("Method main starts..");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);
        context.close();
        System.out.println("Method main ends...");
    }
}
